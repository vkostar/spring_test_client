package com.kostar.spring.rest.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.kostar.spring.rest")
public class Myconfig {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
