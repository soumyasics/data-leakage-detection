package daos;


import java.sql.*;
import java.sql.DriverManager;

public class DBConnection {
	Connection conn;
    Statement stmt;
    ResultSet rs;
public Connection dbConnect() {
    String sql;
        conn = null;
        String url = "jdbc:mysql://localhost:3306/dld";
        String driver = "com.mysql.jdbc.Driver";
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","mysql123");

            

        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
        return conn;
}
}
