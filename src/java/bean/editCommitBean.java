package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCommitBean {
    
    private String commitPlace_up;
    private String commitDate_up;
    private String commitTime_up;
    private int criminal_id_up;
    private int crime_id_up;
    private int commit_id;
    
    public editCommitBean(){
        
    }

    public editCommitBean(String commitPlace_up, String commitDate_up, String commitTime_up, int criminal_id_up, int crime_id_up, int commit_id) {
        this.commitPlace_up = commitPlace_up;
        this.commitDate_up = commitDate_up;
        this.commitTime_up = commitTime_up;
        this.criminal_id_up = criminal_id_up;
        this.crime_id_up = crime_id_up;
        this.commit_id = commit_id;
    }

    public String getCommitPlace_up() {
        return commitPlace_up;
    }

    public void setCommitPlace_up(String commitPlace_up) {
        this.commitPlace_up = commitPlace_up;
    }

    public String getCommitDate_up() {
        return commitDate_up;
    }

    public void setCommitDate_up(String commitDate_up) {
        this.commitDate_up = commitDate_up;
    }

    public String getCommitTime_up() {
        return commitTime_up;
    }

    public void setCommitTime_up(String commitTime_up) {
        this.commitTime_up = commitTime_up;
    }

    public int getCriminal_id_up() {
        return criminal_id_up;
    }

    public void setCriminal_id_up(int criminal_id_up) {
        this.criminal_id_up = criminal_id_up;
    }

    public int getCrime_id_up() {
        return crime_id_up;
    }

    public void setCrime_id_up(int crime_id_up) {
        this.crime_id_up = crime_id_up;
    }

    public int getCommit_id() {
        return commit_id;
    }

    public void setCommit_id(int commit_id) {
        this.commit_id = commit_id;
    }
   
}
