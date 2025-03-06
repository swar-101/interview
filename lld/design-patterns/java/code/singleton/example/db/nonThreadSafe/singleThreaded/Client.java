package db.nonThreadSafe.singleThreaded;

import db.DatabaseConnector;
import db.nonThreadSafe.NaiveDatabaseConnector;
import db.util.Util;

import java.util.List;

public class Client {
    public static final String USERNAME = "tinku";
    public static final String PASSWORD = "46&two";

    public static void main(String[] args) {
        DatabaseConnector myNaiveDatabaseConnector = NaiveDatabaseConnector.getInstance(USERNAME, PASSWORD);
        Util.printCurrentData();

        myNaiveDatabaseConnector.save("el kiwi");
        Util.printCurrentData();

        List<String> data = myNaiveDatabaseConnector.getData();
        Util.printRetrievedData(data);
    }
}