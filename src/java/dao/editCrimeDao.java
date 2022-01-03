package dao;

import bean.editCrimeBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCrimeDao {
    
    public String checkCrimeUpdate (editCrimeBean updateCrime){
        
        String crimeNum_up = updateCrime.getCrimeNum_up();
        String crimeName_up = updateCrime.getCrimeName_up();
        String crimeType_up = updateCrime.getCrimeType_up();
        int user_id_up = updateCrime.getUser_id_up();
        int crime_id = updateCrime.getCrime_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "update CRIME set CRIME_NUM=?,CRIME_NAME=?,CRIME_TYPE=?,USER_ID=? where CRIME_ID=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, crimeNum_up);
            preparedStatement.setString(2, crimeName_up);
            preparedStatement.setString(3, crimeType_up);
            preparedStatement.setInt(4, user_id_up);
            preparedStatement.setInt(5, crime_id);
            
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
