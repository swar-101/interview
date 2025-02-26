package example.db.nonThreadSafe.multiThreaded;

import example.db.nonThreadSafe.NaiveDatabaseConnector;
import example.db.DatabaseConnector;
import example.db.util.Util;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        public static final String USERNAME = "Pedri";
        public static final String PASSWORD = "V1sCaBarca";

        @Override
        public void run() {
            DatabaseConnector naiveDatabase = NaiveDatabaseConnector.getInstance(USERNAME, PASSWORD);
            Util.printDatabaseConfig(naiveDatabase);
            Util.printCurrentData();

            naiveDatabase.save("el te");
            Util.printCurrentData();

            List<String> data = naiveDatabase.getData();
            Util.printRetrievedData(data);
        }
    }

    static class ThreadBar implements Runnable {
        public static final String USERNAME = "Tarang";
        public static final String PASSWORD = "SigMABo1$";

        @Override
        public void run() {
            DatabaseConnector naiveDatabaseConnector = NaiveDatabaseConnector.getInstance(USERNAME, PASSWORD);
            Util.printDatabaseConfig(naiveDatabaseConnector);
            Util.printCurrentData();

            naiveDatabaseConnector.save("las enchiladas");
            Util.printCurrentData();

            List<String> data = naiveDatabaseConnector.getData();
            Util.printRetrievedData(data);
        }
    }
}