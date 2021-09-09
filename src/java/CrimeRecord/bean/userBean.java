package CrimeRecord.bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class userBean implements java.io.Serializable {
    
    private String fullname;
    private String username;
    private String password;
    private String phone;
    private String add_line;
    private String city;
    private String state;
    private String postcode;
    
    public userBean (){
        
    }

    public userBean (String fullname, String username, String password, String phone, String add_line, String city, String state, String postcode) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.add_line = add_line;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdd_line() {
        return add_line;
    }

    public void setAdd_line(String add_line) {
        this.add_line = add_line;
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
   
    

    
}
