package example.db;

public class Main {
    public static void main(String[] args) {
        example.db.nonThreadSafe.singleThreaded.Client.main(args);
        example.db.nonThreadSafe.multiThreaded.Client.main(args);
        example.db.threadSafe.Client.main(args);
    }
}