package mortalkombat.config;

public class Random {

    private Random() throws IllegalAccessException {
        throw new IllegalAccessException("This is a utility class.");
    }

    public static final java.util.Random globalRandom = new java.util.Random();
}