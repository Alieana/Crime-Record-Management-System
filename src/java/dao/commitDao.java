package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.commitBean;
import util.DBConnection;

/**
 *
 * @author Siti Alieana Shahda
 */
public class commitDao {
    
    public String registerCommit(commitBean addCommit){
        
        String commitPlace = addCommit.getCommitPlace();
        String commitDate = addCommit.getCommitDate();
        String commitTime = addCommit.getCommitTime();
        int criminal_id = addCommit.getCriminalID();
        int crime_id = addCommit.getCrimeID();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "insert into COMMITS(COMMIT_PLACE,COMMIT_DATE,COMMIT_TIME,CRIMINAL_ID,CRIME_ID) values (?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, commitPlace);
            preparedStatement.setString(2, commitDate);
            preparedStatement.setString(3, commitTime);
            preparedStatement.setInt(4, criminal_id);
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
