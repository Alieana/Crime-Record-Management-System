package dao;

import bean.editUserBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editUserDao {
    
    public String checkUserUpdate (editUserBean updateUser){
        
        String fullname_up = updateUser.getFullname_up();
        String username_up = updateUser.getUsername_up();
        String password_up = updateUser.getPassword_up();
        String phone_up = updateUser.getPhone_up();
        String add_line_up = updateUser.getAdd_line_up();
        String city_up = updateUser.getCity_up();
        String state_up = updateUser.getState_up();
        String postcode_up = updateUser.getState_up();
        int role_id_up = updateUser.getRole_id_up();
        int user_id = updateUser.getUser_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "update USERS set USER_FULLNAME=?,USERNAME=?,USER_PASS=?,USER_PHONE=?,USER_ADD=?,USER_CITY=?,USER_STATE=?,USER_POSTCODE=?,ROLE_ID=? where USER_ID=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, fullname_up);
            preparedStatement.setString(2, username_up);
            preparedStatement.setString(3, password_up);
            preparedStatement.setString(4, phone_up);
            preparedStatement.setString(5, add_line_up);
            preparedStatement.setString(6, city_up);
            preparedStatement.setString(7, state_up);
            preparedStatement.setString(8, postcode_up);
            preparedStatement.setInt(9, role_id_up);
            preparedStatement.setInt(10, user_id);
            preparedStatement.executeUpdate();
            
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
   

