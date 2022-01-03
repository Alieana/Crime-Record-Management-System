package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.userBean;
import util.DBConnection;

/**
 *
 * @author Siti Alieana Shahda
 */
public class userDao {
    
    public String registerCheck(userBean addUser){
        
        String fullname = addUser.getFullname();
        String username = addUser.getUsername();
        String password = addUser.getPassword();
        String phone = addUser.getPhone();
        String add_line = addUser.getAdd_line();
        String city = addUser.getCity();
        String state = addUser.getState();
        String postcode = addUser.getState();
        int role_id = addUser.getRole_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "insert into USERS(USER_FULLNAME,USERNAME,USER_PASS,USER_PHONE,USER_ADD,USER_CITY,USER_STATE,USER_POSTCODE,ROLE_ID) values (?,?,?,?,?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, fullname);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, add_line);
            preparedStatement.setString(6, city);
            preparedStatement.setString(7, state);
            preparedStatement.setString(8, postcode);
            preparedStatement.setInt(9, role_id);
            
            int i = preparedStatement.executeUpdate();
            
            if (i!=0){
                
                return "SUCCESS";
            }  
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        
        return "Invalid Input";
    }
    
}
