package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class roleBean {
    
    private String roleNum;
    private String roleName;
    
    public roleBean(){
        
    }

    public roleBean(String roleNum, String roleName) {
        this.roleNum = roleNum;
        this.roleName = roleName;
    }

    public String getRoleNum() {
        return roleNum;
    }

    public void setRoleNum(String roleNum) {
        this.roleNum = roleNum;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
    
}
