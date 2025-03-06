package db;

import db.util.Util;

import java.util.List;

import static example.db.data.MockData.*;

public abstract class DatabaseConnector {

    protected String url;
    protected String username;
    protected String password;

    protected DatabaseConnector(String username, String password) {
        this.url = "db.example.com";
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return "****";
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public void save(String value) {
        System.out.println("Saving " + value + " to the DB.");
        data.add(value);
        Util.simulateLatency(10); // 1 to 10 milliseconds
        System.out.println("This data is saved successfully.");
    }

    public List<String> getData() {
        System.out.println("Retrieving data from DB.");
        Util.simulateLatency(100);   // 10 to 100 milliseconds
        return data;
    }
}