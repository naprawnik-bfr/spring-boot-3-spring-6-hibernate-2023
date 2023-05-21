package com.naprawnikbfr.demo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: SwimCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100m";
    }
}
