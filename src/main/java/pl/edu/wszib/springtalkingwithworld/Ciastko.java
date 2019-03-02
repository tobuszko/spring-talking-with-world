package pl.edu.wszib.springtalkingwithworld;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

@Component
@Scope(value = SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Ciastko {

    private boolean zjedzone = false;

    public boolean isZjedzone () {
        return zjedzone;
    }

    public void zjedz () {
        zjedzone = true;
    }

}
