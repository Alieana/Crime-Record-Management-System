package dao;

import bean.editRoleBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editRoleDao {
    
    public String checkRoleUpdate (editRoleBean updateRole){
        
        String roleNum_up = updateRole.getRoleNum_up();
        String roleName_up = updateRole.getRoleName_up();
        int role_id = updateRole.getRole_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "update ROLES set ROLE_NUM=?,ROLE_NAME=? where ROLE_ID=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, roleNum_up);
            preparedStatement.setString(2, roleName_up);
            preparedStatement.setInt(3, role_id);
            
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
