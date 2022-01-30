package com.example.oauth2_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // allow antonymous access to the root page
                .antMatchers("/").permitAll()
                // all other requests
                .anyRequest().authenticated()

                // set logout URL
                .and().logout().logoutSuccessUrl("/")

                // enable OAuth2/OIDC
                .and().oauth2Client()
                .and().oauth2Login();
}}