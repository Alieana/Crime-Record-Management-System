package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class commitBean {
    
    private String commitPlace;
    private String commitDate;
    private String commitTime;
    private int criminalID;
    private int crimeID;
    
    public commitBean(){
        
    }

    public commitBean(String commitPlace, String commitDate, String commitTime, int criminalID, int crimeID) {
        this.commitPlace = commitPlace;
        this.commitDate = commitDate;
        this.commitTime = commitTime;
        this.criminalID = criminalID;
        this.crimeID = crimeID;
    }

    public String getCommitPlace() {
        return commitPlace;
    }

    public void setCommitPlace(String commitPlace) {
        this.commitPlace = commitPlace;
    }

    public String getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(String commitDate) {
        this.commitDate = commitDate;
    }

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    public int getCriminalID() {
        return criminalID;
    }

    public void setCriminalID(int criminalID) {
        this.criminalID = criminalID;
    }

    public int getCrimeID() {
        return crimeID;
    }

    public void setCrimeID(int crimeID) {
        this.crimeID = crimeID;
    }
    
}
