package com.naprawnikbfr.demo.common;

import org.springframework.stereotype.Component;

@Component //marks the class a spring bean
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: CricketCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
