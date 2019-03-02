package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class viewConfiguration {

/*
    @Bean
    public ViewResolver viewResolver () {
        InternalResourceViewResolver resolver1 = new InternalResourceViewResolver();
        resolver1.setPrefix("/");
        resolver1.setSuffix(".html");
        return resolver1;
    }
*/


    @Bean
    public ViewResolver viewResolver () {
        InternalResourceViewResolver resolver1 = new InternalResourceViewResolver();
        resolver1.setPrefix("/");
        resolver1.setSuffix(".png");
        return resolver1;
    }


}
