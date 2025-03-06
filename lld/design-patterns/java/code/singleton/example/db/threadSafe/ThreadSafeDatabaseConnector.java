package db.threadSafe;

import db.DatabaseConnector;
import db.util.Util;

public class ThreadSafeDatabaseConnector extends DatabaseConnector {

    public static ThreadSafeDatabaseConnector instance = null;

    private ThreadSafeDatabaseConnector(String username, String password) {
        super(username, password);
    }

    /*
    * Thread-safe instances are created using 'Double-checked Locking'
    *   Double-checked Locking
    *       Q. What it does?
    *       A: Prevents race condition between multiple threads that may attempt to get singleton instance
    *           at the same time.
    *
    *       Q. How does it do this?
    *       A: Help me with the ChatGPT. The answer should be 20 to 30 words max, I want it concise.
    *
    *       Q. Why it does so?
    *       A: Chat, here too!
    * */
    public static DatabaseConnector getInstance(String username, String password) {
        DatabaseConnector currentInstance = instance;
        Util.simulateLatency(100);
        if (currentInstance == null) {
            Util.simulateLatency(200);
            return instantiateThreadSafeDatabase(username, password);
        }
        return instance;
    }

    /* We instantiate thread-safe Database object by using the `synchronized` keyword. */
    private static DatabaseConnector instantiateThreadSafeDatabase(String username, String password) {
        synchronized (DatabaseConnector.class) {
            if (instance == null) {
                instance = new ThreadSafeDatabaseConnector(username, password);
            }
            return instance;
        }
    }
}