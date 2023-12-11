package be.archilios.wishingwell.security.user;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserDetailsFromDatabaseService implements UserDetailsService {
    private final AuthenticationUserRepository repository;
    
    public UserDetailsFromDatabaseService(AuthenticationUserRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthenticationUser loadedUser =
                repository.findByUsername(username)
                        .orElseThrow(
                                () -> new UsernameNotFoundException("User not found")
                        );
        
        return new WishingwellUserDetails(loadedUser);
    }
}
