import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DatabaseManager.getConnection();

        if (con != null) {

            Statement statement = con.createStatement();

            // Query
            String query = "SELECT * FROM customer";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("ID\tName\tEmail\t\t\t\tPhone" );

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");

                System.out.println(id + "\t" + name + "\t" + address + "\t\t" + phone);
            }
            DatabaseManager.closeConnection();
        }
    }
}

