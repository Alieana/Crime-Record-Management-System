package CrimeRecordDAO;

import CrimeRecord.bean.loginBean;
import CrimeRecord.util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class loginDao {
    
    public String authenticateUser(loginBean LoginBean){
        
        String username = LoginBean.getUsername();
        String password = LoginBean.getPassword();
        
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String usernameDB = "";
        String passwordDB = "";
        
        try{
            
            conn = DBConnection.createConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select username, password from CrimeRecordDB");
            
           while (resultSet.next()) {
                
                usernameDB = resultSet.getString("username");
                passwordDB = resultSet.getString("password");
                
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
