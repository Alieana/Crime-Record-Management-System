package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCrimeBean {
    
    private String crimeNum_up;
    private String crimeName_up;
    private String crimeType_up;
    private int user_id_up;
    private int crime_id;
    
    public editCrimeBean(){
        
    }

    public editCrimeBean(String crimeNum_up, String crimeName_up, String crimeType_up, int user_id_up, int crime_id) {
        this.crimeNum_up = crimeNum_up;
        this.crimeName_up = crimeName_up;
        this.crimeType_up = crimeType_up;
        this.user_id_up = user_id_up;
        this.crime_id = crime_id;
    }

    public String getCrimeNum_up() {
        return crimeNum_up;
    }

    public void setCrimeNum_up(String crimeNum_up) {
        this.crimeNum_up = crimeNum_up;
    }

    public String getCrimeName_up() {
        return crimeName_up;
    }

    public void setCrimeName_up(String crimeName_up) {
        this.crimeName_up = crimeName_up;
    }

    public String getCrimeType_up() {
        return crimeType_up;
    }

    public void setCrimeType_up(String crimeType_up) {
        this.crimeType_up = crimeType_up;
    }

    public int getUser_id_up() {
        return user_id_up;
    }

    public void setUser_id_up(int user_id_up) {
        this.user_id_up = user_id_up;
    }

    public int getCrime_id() {
        return crime_id;
    }

    public void setCrime_id(int crime_id) {
        this.crime_id = crime_id;
    }
    
}
