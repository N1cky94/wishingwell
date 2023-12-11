package be.archilios.wishingwell.security;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinServletRequest;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

@Component
public class SecurityService {
    private static final String LOGOUT_SUCCES_URL = "/";
    
    public UserDetails getAuthenticatedUser() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Object principal = ctx.getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return (UserDetails) principal;
        }
        
        return null;
    }
    
    public void logout() {
        UI.getCurrent().getPage().setLocation(LOGOUT_SUCCES_URL);
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
        logoutHandler.logout(
                VaadinServletRequest.getCurrent().getHttpServletRequest(),
                null,
                null
        );
    }
}
