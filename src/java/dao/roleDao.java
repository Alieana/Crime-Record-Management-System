package dao;

import bean.roleBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class roleDao {
    
    public String registerRole (roleBean addRole){
        
        String roleNum = addRole.getRoleNum();
        String roleName = addRole.getRoleName();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "insert into ROLES(ROLE_NUM,ROLE_NAME) values (?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, roleNum);
            preparedStatement.setString(2, roleName);
            
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
