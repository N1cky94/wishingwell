package be.archilios.wishingwell.security;

import be.archilios.wishingwell.frontend.auth.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends VaadinWebSecurity {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                auth -> auth.requestMatchers(
                        new AntPathRequestMatcher("/public/**"),
                        new AntPathRequestMatcher("/images/public/**"),
                        new AntPathRequestMatcher("/line-awesome/**")
                ).permitAll()
        );
        
        super.configure(http);
        
        setLoginView(http, LoginView.class);
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
