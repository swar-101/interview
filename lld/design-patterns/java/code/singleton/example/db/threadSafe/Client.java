package db.threadSafe;

import db.DatabaseConnector;
import db.util.Util;

import java.util.List;

public class Client {
    public static final String USERNAME = "swar";
    public static final String PASSWORD = "123";

    public static void main(String[] args) {
        DatabaseConnector myThreadSafeDb = ThreadSafeDatabaseConnector.getInstance(USERNAME, PASSWORD);
        Util.printCurrentData();

        myThreadSafeDb.save("el melocoton");
        Util.printCurrentData();

        List<String> data = myThreadSafeDb.getData();
        Util.printRetrievedData(data);
    }
}