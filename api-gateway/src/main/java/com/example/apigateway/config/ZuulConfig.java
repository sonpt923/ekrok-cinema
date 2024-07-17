package com.example.apigateway.config;

import com.example.apigateway.filter.PreAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

    @Bean
    public PreAuthenticationFilter preAuthenticationFilter(){
        return new PreAuthenticationFilter();
    }

}
