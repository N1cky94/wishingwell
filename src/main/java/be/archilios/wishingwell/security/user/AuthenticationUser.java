package be.archilios.wishingwell.security.user;

public class AuthenticationUser {
    private Long id;
    private String username;
    private String password;
    private AuthenticationRole role;
    private boolean inactiveAccount;
    
    public AuthenticationUser() {
    }
    
    public AuthenticationUser(Long id, String username, String password, AuthenticationRole role, boolean inactiveAccount) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.inactiveAccount = inactiveAccount;
    }
    
    public Long getId() {
        return id;
    }
    
    private void setId(Long id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    private void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    private void setPassword(String password) {
        this.password = password;
    }
    
    public AuthenticationRole getRole() {
        return role;
    }
    
    private void setRole(AuthenticationRole role) {
        this.role = role;
    }
    
    public boolean isInactiveAccount() {
        return inactiveAccount;
    }
    
    private void setInactiveAccount(boolean inactiveAccount) {
        this.inactiveAccount = inactiveAccount;
    }
}
