package dao;

import bean.editCriminalBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCriminalDao {
    
    public String updateCriminalCheck(editCriminalBean updateCriminal){
        
        String criminalNum_up = updateCriminal.getCriminalNum_up();
        String criminalName_up = updateCriminal.getCriminalName_up();
        String criminalDOB_up = updateCriminal.getCriminalDOB_up();
        String criminalPhone_up = updateCriminal.getCriminalphone_up();
        String criminalAdd_up = updateCriminal.getCriminalAdd_up();
        String criminalCity_up = updateCriminal.getCity_up();
        String criminalState_up = updateCriminal.getState_up();
        String criminalPostcode_up = updateCriminal.getPostcode_up();
        String familyPhone_up = updateCriminal.getFamPhone_up();
        int user_id_up = updateCriminal.getUser_id_up();
        int criminal_id = updateCriminal.getCriminal_id();
        
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "update CRIMINALS set CRIMINAL_NUM=?,CRIMINAL_NAME=?,CRIMINAL_DOB=?,CRIMINAL_PHONE=?,CRIMINAL_ADD=?,CRIMINAL_CITY=?,CRIMINAL_STATE=?,CRIMINAL_POSTCODE=?,FAMILY_PHONE=?,USER_ID=? where CRIMINAL_ID=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, criminalNum_up);
            preparedStatement.setString(2, criminalName_up);
            preparedStatement.setString(3, criminalDOB_up);
            preparedStatement.setString(4, criminalPhone_up);
            preparedStatement.setString(5, criminalAdd_up);
            preparedStatement.setString(6, criminalCity_up);
            preparedStatement.setString(7, criminalState_up);
            preparedStatement.setString(8, criminalPostcode_up);
            preparedStatement.setString(9, familyPhone_up);
            preparedStatement.setInt(10, user_id_up);
            preparedStatement.setInt(11, criminal_id);
            
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
