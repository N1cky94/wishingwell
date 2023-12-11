package be.archilios.wishingwell.security.user;

import jakarta.persistence.*;

@Entity
@Table(name="authentication_users")
public class AuthenticationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private AuthenticationRole role;
    
    public AuthenticationUser() {
    }
    
    public AuthenticationUser(Long id, String username, String password, AuthenticationRole role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
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
}
