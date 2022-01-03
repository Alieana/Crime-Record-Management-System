package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editCriminalBean {
    
    private String criminalNum_up;
    private String criminalName_up;
    private String criminalDOB_up;
    private String criminalphone_up;
    private String criminalAdd_up;
    private String city_up;
    private String state_up;
    private String postcode_up;
    private String famPhone_up;
    private int user_id_up;
    private int criminal_id;

    public editCriminalBean(){
        
    }
    
    public editCriminalBean(String criminalNum_up, String criminalName_up, String criminalDOB_up, String criminalphone_up, String criminalAdd_up, String city_up, String state_up, String postcode_up, String famPhone_up, int user_id_up, int criminal_id) {
        this.criminalNum_up = criminalNum_up;
        this.criminalName_up = criminalName_up;
        this.criminalDOB_up = criminalDOB_up;
        this.criminalphone_up = criminalphone_up;
        this.criminalAdd_up = criminalAdd_up;
        this.city_up = city_up;
        this.state_up = state_up;
        this.postcode_up = postcode_up;
        this.famPhone_up = famPhone_up;
        this.user_id_up = user_id_up;
        this.criminal_id = criminal_id;
    }

    public String getCriminalNum_up() {
        return criminalNum_up;
    }

    public void setCriminalNum_up(String criminalNum_up) {
        this.criminalNum_up = criminalNum_up;
    }

    public String getCriminalName_up() {
        return criminalName_up;
    }

    public void setCriminalName_up(String criminalName_up) {
        this.criminalName_up = criminalName_up;
    }

    public String getCriminalDOB_up() {
        return criminalDOB_up;
    }

    public void setCriminalDOB_up(String criminalDOB_up) {
        this.criminalDOB_up = criminalDOB_up;
    }

    public String getCriminalphone_up() {
        return criminalphone_up;
    }

    public void setCriminalphone_up(String criminalphone_up) {
        this.criminalphone_up = criminalphone_up;
    }

    public String getCriminalAdd_up() {
        return criminalAdd_up;
    }

    public void setCriminalAdd_up(String criminalAdd_up) {
        this.criminalAdd_up = criminalAdd_up;
    }

    public String getCity_up() {
        return city_up;
    }

    public void setCity_up(String city_up) {
        this.city_up = city_up;
    }

    public String getState_up() {
        return state_up;
    }

    public void setState_up(String state_up) {
        this.state_up = state_up;
    }

    public String getPostcode_up() {
        return postcode_up;
    }

    public void setPostcode_up(String postcode_up) {
        this.postcode_up = postcode_up;
    }

    public String getFamPhone_up() {
        return famPhone_up;
    }

    public void setFamPhone_up(String famPhone_up) {
        this.famPhone_up = famPhone_up;
    }

    public int getUser_id_up() {
        return user_id_up;
    }

    public void setUser_id_up(int user_id_up) {
        this.user_id_up = user_id_up;
    }

    public int getCriminal_id() {
        return criminal_id;
    }

    public void setCriminal_id(int criminal_id) {
        this.criminal_id = criminal_id;
    }
    
}
