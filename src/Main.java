import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connectionDB = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345678");
            connectionDB.createStatement();
            connectionDB.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
