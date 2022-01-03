package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class criminalBean {
    
    private String criminalNum;
    private String criminalName;
    private String criminalDOB;
    private String criminalphone;
    private String criminalAdd;
    private String city;
    private String state;
    private String postcode;
    private String famPhone;
    private int user_id;
    
    public criminalBean(){
        
    }

    public criminalBean(String criminalNum, String criminalName, String criminalDOB, String criminalphone, String criminalAdd, String city, String state, String postcode, String famPhone, int user_id) {
        this.criminalNum = criminalNum;
        this.criminalName = criminalName;
        this.criminalDOB = criminalDOB;
        this.criminalphone = criminalphone;
        this.criminalAdd = criminalAdd;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.famPhone = famPhone;
        this.user_id = user_id;
    }

    public String getCriminalNum() {
        return criminalNum;
    }

    public void setCriminalNum(String criminalNum) {
        this.criminalNum = criminalNum;
    }

    public String getCriminalName() {
        return criminalName;
    }

    public void setCriminalName(String criminalName) {
        this.criminalName = criminalName;
    }
    
    public String getCriminalDOB() {
        return criminalDOB;
    }

    public void setCriminalDOB(String criminalDOB) {
        this.criminalDOB = criminalDOB;
    }

    public String getCriminalphone() {
        return criminalphone;
    }

    public void setCriminalphone(String criminalphone) {
        this.criminalphone = criminalphone;
    }

    public String getCriminalAdd() {
        return criminalAdd;
    }

    public void setCriminalAdd(String criminalAdd) {
        this.criminalAdd = criminalAdd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getFamPhone() {
        return famPhone;
    }

    public void setFamPhone(String famPhone) {
        this.famPhone = famPhone;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
