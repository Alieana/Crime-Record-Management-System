package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.criminalBean;
import util.DBConnection;

/**
 *
 * @author Siti Alieana Shahda
 */
public class criminalDao {
    
    public String criminalCheck(criminalBean addCriminal){
        
        String criminalNum = addCriminal.getCriminalNum();
        String criminalName = addCriminal.getCriminalName();
        String criminalDOB = addCriminal.getCriminalDOB();
        String criminalPhone = addCriminal.getCriminalphone();
        String criminalAdd = addCriminal.getCriminalAdd();
        String criminalCity = addCriminal.getCity();
        String criminalState = addCriminal.getState();
        String criminalPostcode = addCriminal.getPostcode();
        String familyPhone = addCriminal.getFamPhone();
        int user_id = addCriminal.getUser_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "insert into CRIMINALS(CRIMINAL_NUM,CRIMINAL_NAME,CRIMINAL_DOB,CRIMINAL_PHONE,CRIMINAL_ADD,CRIMINAL_CITY,CRIMINAL_STATE,CRIMINAL_POSTCODE,FAMILY_PHONE,USER_ID) values (?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, criminalNum);
            preparedStatement.setString(2, criminalName);
            preparedStatement.setString(3, criminalDOB);
            preparedStatement.setString(4, criminalPhone);
            preparedStatement.setString(5, criminalAdd);
            preparedStatement.setString(6, criminalCity);
            preparedStatement.setString(7, criminalState);
            preparedStatement.setString(8, criminalPostcode);
            preparedStatement.setString(9, familyPhone);
            preparedStatement.setInt(10, user_id);
            
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

