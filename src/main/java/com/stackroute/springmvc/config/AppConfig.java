package com.stackroute.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
/*Enable support for @Controller-annotated classes that use
@RequestMapping to map incoming requests to specific method*/
@EnableWebMvc
//Looks for Spring managed beans/classes/components
@ComponentScan(basePackages = "com.stackroute.springmvc")
public class AppConfig {

    @Bean(name = "HelloWorld")
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        Jstl: JSP tag library
        viewResolver.setViewClass(JstlView.class);

        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

//        Resolves to /WEB-INF/views/welcome.jsp
        return viewResolver;
    }

}
