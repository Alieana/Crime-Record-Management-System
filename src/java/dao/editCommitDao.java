package dao;

import bean.editCommitBean;
import util.DBConnection;
import java.sql.*;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCommitDao {
    
    public String checkCommitUpdate (editCommitBean updateCommit){
        
        String commitPlace_up = updateCommit.getCommitPlace_up();
        String commitDate_up = updateCommit.getCommitDate_up();
        String commitTime_up = updateCommit.getCommitTime_up();
        int criminal_id_up = updateCommit.getCriminal_id_up();
        int crime_id_up = updateCommit.getCrime_id_up();
        int commit_id = updateCommit.getCommit_id();
        
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try{
            
            conn = DBConnection.createConnection();
            String query = "update COMMITS set COMMIT_PLACE=?,COMMIT_DATE=?,COMMIT_TIME=?,CRIMINAL_ID=?,CRIME_ID=? where COMMIT_ID=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, commitPlace_up);
            preparedStatement.setString(2, commitDate_up);
            preparedStatement.setString(3, commitTime_up);
            preparedStatement.setInt(4, criminal_id_up);
            preparedStatement.setInt(5, crime_id_up);
            preparedStatement.setInt(6, commit_id);
            
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
