package dao;

import bean.loginBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class loginDao {
    
    public String authenticateUser(loginBean LoginBean){
        
        String username = LoginBean.getUsername();
        String password = LoginBean.getPassword();
        
        Connection conn= null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String usernameDB = "";
        String passwordDB = "";
        
        try{
            
            conn = DBConnection.createConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select USERNAME, USER_PASS from USERS");
            
           while (resultSet.next()) {
                
                usernameDB = resultSet.getString("USERNAME");
                passwordDB = resultSet.getString("USER_PASS");
                
                if (username.equals(usernameDB) && password.equals(passwordDB)) {
                    
                    return "SUCCESS";
                }
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        
        return "Invalid user credentials";
    }
}
