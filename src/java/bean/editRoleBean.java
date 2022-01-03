package bean;

/**
 *
 * @author Siti Alieana Shahda
 */
public class editRoleBean {
    
    private String roleNum_up;
    private String roleName_up;
    private int role_id;
    
    public editRoleBean(){
        
    }

    public editRoleBean(String roleNum_up, String roleName_up, int role_id) {
        this.roleNum_up = roleNum_up;
        this.roleName_up = roleName_up;
        this.role_id = role_id;
    }

    public String getRoleNum_up() {
        return roleNum_up;
    }

    public void setRoleNum_up(String roleNum_up) {
        this.roleNum_up = roleNum_up;
    }

    public String getRoleName_up() {
        return roleName_up;
    }

    public void setRoleName_up(String roleName_up) {
        this.roleName_up = roleName_up;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    
    
}
