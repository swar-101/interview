package connectionpool;

import java.util.concurrent.BlockingQueue;

public class ConnectionPoolImpl implements ConnectionPool {

    private final int maxConnections;

    private BlockingQueue<DatabaseConnection> availableConnections;

    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;

    }

    public static ConnectionPool INSTANCE;

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            availableConnections.offer(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        if (availableConnections.isEmpty()) {
            return null;
        }
        return availableConnections.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if (connection != null) {
            availableConnections.offer(connection);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }

    public ConnectionPool getInstance(int maxConnections) {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionPoolImpl(maxConnections);
        }
        return INSTANCE;
    }

    public void resetInstance() {
        INSTANCE = null;
    }
}