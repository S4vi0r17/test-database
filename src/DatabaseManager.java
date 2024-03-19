import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/customersdb";
    private static final String USER =  "root";
    private static final String PASSWORD = "benites1234";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        if (connection != null) {
            System.out.println("connected");
        } else {
            System.out.println("not connected");
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        System.out.println("closed connection");
        connection.close();
    }
}