package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class crimeBean {
    
    private String crimeNum;
    private String crimeName;
    private String crimeType;
    private int user_id;
    
    public crimeBean(){
        
    }

    public crimeBean(String crimeNum, String crimeName, String crimeType, int user_id) {
        this.crimeNum = crimeNum;
        this.crimeName = crimeName;
        this.crimeType = crimeType;
        this.user_id = user_id;
    }

    public String getCrimeNum() {
        return crimeNum;
    }

    public void setCrimeNum(String crimeNum) {
        this.crimeNum = crimeNum;
    }

    public String getCrimeName() {
        return crimeName;
    }

    public void setCrimeName(String crimeName) {
        this.crimeName = crimeName;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
