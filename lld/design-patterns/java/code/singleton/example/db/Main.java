package db;

public class Main {
    public static void main(String[] args) {
        db.nonThreadSafe.singleThreaded.Client.main(args);
        db.nonThreadSafe.multiThreaded.Client.main(args);
        db.threadSafe.Client.main(args);
    }
}