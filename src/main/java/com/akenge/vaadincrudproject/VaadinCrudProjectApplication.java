package com.akenge.vaadincrudproject;

import com.akenge.vaadincrudproject.ui.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class VaadinCrudProjectApplication extends VaadinWebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(VaadinCrudProjectApplication.class, args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        setLoginView(http,LoginView.class);
    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return new InMemoryUserDetailsManager(
                User.withUsername("ARAKAZA")
                .password("{noop}p")
                .roles("ADMIN")
                .build(),
                User.withUsername("DAPHROSE")
                        .password("{noop}p")
                        .roles("ADMIN")
                        .build()
        );
    }
}
