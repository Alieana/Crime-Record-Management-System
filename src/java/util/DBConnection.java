package util;

import java.sql.*;
/**
 *
 * @author Siti Alieana Shahda
 */
public class DBConnection {
    
    public static Connection createConnection() {
        
        Connection conn = null;
        String url = "jdbc:derby://localhost:1527/CrimeRecordDB";
        String username = "app";
        String password="app";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return conn;
        }
}
