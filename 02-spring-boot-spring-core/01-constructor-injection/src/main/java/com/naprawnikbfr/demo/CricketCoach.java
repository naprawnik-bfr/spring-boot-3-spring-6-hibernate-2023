package com.naprawnikbfr.demo;

import org.springframework.stereotype.Component;

@Component //marks the class a spring bean
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
