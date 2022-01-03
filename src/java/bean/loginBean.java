package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class loginBean {
    
    private String username;
    private String password;
    
    public loginBean(){
        
    }

    public loginBean(String username, String password) {
        this.username = username;
        this.password = password;
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
 
}
