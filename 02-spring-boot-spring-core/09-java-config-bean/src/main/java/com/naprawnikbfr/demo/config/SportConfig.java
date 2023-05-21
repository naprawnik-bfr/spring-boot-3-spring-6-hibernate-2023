package com.naprawnikbfr.demo.config;

import com.naprawnikbfr.demo.common.Coach;
import com.naprawnikbfr.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
