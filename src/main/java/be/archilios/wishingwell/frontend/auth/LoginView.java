package be.archilios.wishingwell.frontend.auth;

import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
@PageTitle("Login")
@AnonymousAllowed
public class LoginView extends VerticalLayout implements BeforeEnterObserver {
    private LoginForm login = new LoginForm();
    
    public LoginView() {
        addClassName("login-view");
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        
        Image logo = new Image("images/public/Kiwanis-strop-banner.png", "Kiwanis Stroppendrager Banner Logo");
        logo.setMaxHeight(100, Unit.PIXELS);
        logo.setMinHeight(20, Unit.PIXELS);
        logo.setMaxWidth(80, Unit.PERCENTAGE);
        
        login.setAction("login");
        add(
                logo,
                new H1("Mijn Stropje"),
                login
        );
    }
    
    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        if (beforeEnterEvent.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")) {
            login.setError(true);
        }
    }
}
