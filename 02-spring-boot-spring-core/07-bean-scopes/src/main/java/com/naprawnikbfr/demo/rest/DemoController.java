package com.naprawnikbfr.demo.rest;

import com.naprawnikbfr.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    //constructor injection
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor : " +getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping ("/check")
    public String check(){
        return "Comparing beans for myCoach == anotherCoach: " + (myCoach == anotherCoach);
    }


}
