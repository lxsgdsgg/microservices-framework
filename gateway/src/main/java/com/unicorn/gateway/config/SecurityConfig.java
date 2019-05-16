package com.unicorn.gateway.config;/**
 * @AUTHOR Awake
 * Created by awake on 2019/5/16.
 */

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: microservice-framework
 * @description:
 * @author: Awake
 * @create: 2019-05-16 18:44
 **/
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();


    }


}