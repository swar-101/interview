package db.util;

import db.DatabaseConnector;
import example.db.data.MockData;

import java.util.List;

public class Util {

    public static void simulateLatency(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printDatabaseConfig(DatabaseConnector connector) {
        System.out.println("The DB configurations are : " +
                "\nUsername : " + connector.getUsername() +
                "\nPassword : " + connector.getPassword() +
                "\nURL : " + connector.getUrl());
    }

    public static void printRetrievedData(List<String> data) {
        System.out.println("Data retrieved from DB by `getData()` API : " + data);
    }

    public static void printCurrentData() {
        System.out.println("Current Data in DB : " + MockData.data);
    }
}