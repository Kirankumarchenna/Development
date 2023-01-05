

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        Connection conn;
        ResultSet resultSet;
        Statement statement;
        DriverManager driverManager = (DriverManager) DriverManager.getDriver("jdbc:oracle:thin:@//myoracle.db.server:1521/my_servicename");
           try {
               Class.forName("oracle.jdbc.driver.OracleDriver");
           }catch (Exception e){
               e.getMessage();
           }
            conn = driverManager.getConnection("jdbc:oracle:thin:@10.109.54.12:1521/rbmbe_ci.netcracker.com", "geneva_admin", "geneva_admin");
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select * from tabs");

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + resultSet.getString(2));
        }
    }
}
