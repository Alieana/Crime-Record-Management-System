package dao;

import bean.crimeBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class crimeDao {
    
    public String registerCrime (crimeBean addCrime){
        
        String crimeNum = addCrime.getCrimeNum();
        String crimeName = addCrime.getCrimeName();
        String crimeType = addCrime.getCrimeType();
        int user_id = addCrime.getUser_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "insert into CRIME(CRIME_NUM,CRIME_NAME,CRIME_TYPE,USER_ID) values (?,?,?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, crimeNum);
            preparedStatement.setString(2, crimeName);
            preparedStatement.setString(3, crimeType);
            preparedStatement.setInt(4, user_id);
            
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
