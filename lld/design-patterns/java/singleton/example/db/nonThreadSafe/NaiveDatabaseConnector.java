package example.db.nonThreadSafe;

import example.db.DatabaseConnector;

import static example.db.util.Util.simulateLatency;

public class NaiveDatabaseConnector extends DatabaseConnector {

    /* Declaring the singleton instance and initializing it to 'null' */
    private static final NaiveDatabaseConnector instance = null;

    public String url;
    public String username;
    public String password;

    /* Always a private constructor.
     *   Q. Why?
     *   A: Simply because, private constructors prevent instantiation from outside the class.
     * */
    private NaiveDatabaseConnector(String username, String password) {
        super(username, password);
    }

    public static DatabaseConnector getInstance(String username, String password) {
        simulateLatency(100);
        if (instance == null) {
            simulateLatency(200);
            return new NaiveDatabaseConnector(username, password);
        }

        return instance;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }
}