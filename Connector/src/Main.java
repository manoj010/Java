import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mydatabase";
        Connection conn = DriverManager.getConnection(url, "root", "");
//        System.out.println("Connection Success");

        Statement statement = conn.createStatement();
//        statement.executeUpdate("insert into data values ('2','Jadoo','Koi Mil Gaya','Doesnt go')");
//        statement.executeUpdate("update data set name = 'Manoj' where id = 1");
//        statement.executeUpdate("delete from data where id = 2");
//        ResultSet resultSet = statement.executeQuery("SELECT * from data where id = '1'");
//        System.out.println(resultSet);

        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * from data where id = ? AND college = ?");
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2,"KIST");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.print(resultSet.getInt("id") + "   ");
            System.out.print(resultSet.getString("name") + "   ");
            System.out.print(resultSet.getString("address") + "   ");
            System.out.print(resultSet.getString("college") + "   ");
            System.out.println();
        }
    }
}