package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editUserBean {
    
    private String fullname_up;
    private String username_up;
    private String password_up;
    private String phone_up;
    private String add_line_up;
    private String city_up;
    private String state_up;
    private String postcode_up;
    private int role_id_up;
    private int user_id;
    
    public editUserBean(){
        
    }

    public editUserBean(String fullname_up, String username_up, String password_up, String phone_up, String add_line_up, String city_up, String state_up, String postcode_up, int role_id_up, int user_id) {
        this.fullname_up = fullname_up;
        this.username_up = username_up;
        this.password_up = password_up;
        this.phone_up = phone_up;
        this.add_line_up = add_line_up;
        this.city_up = city_up;
        this.state_up = state_up;
        this.postcode_up = postcode_up;
        this.role_id_up = role_id_up;
        this.user_id = user_id;
    }

    public String getFullname_up() {
        return fullname_up;
    }

    public void setFullname_up(String fullname_up) {
        this.fullname_up = fullname_up;
    }

    public String getUsername_up() {
        return username_up;
    }

    public void setUsername_up(String username_up) {
        this.username_up = username_up;
    }

    public String getPassword_up() {
        return password_up;
    }

    public void setPassword_up(String password_up) {
        this.password_up = password_up;
    }

    public String getPhone_up() {
        return phone_up;
    }

    public void setPhone_up(String phone_up) {
        this.phone_up = phone_up;
    }

    public String getAdd_line_up() {
        return add_line_up;
    }

    public void setAdd_line_up(String add_line_up) {
        this.add_line_up = add_line_up;
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

    public int getRole_id_up() {
        return role_id_up;
    }

    public void setRole_id_up(int role_id_up) {
        this.role_id_up = role_id_up;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
}
