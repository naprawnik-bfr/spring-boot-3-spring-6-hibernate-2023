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

    //constructor injection
    @Autowired
    public  DemoController (@Qualifier("cricketCoach") Coach myCoach){ //bean id - same as class name except first char lowercased
        System.out.println("In constructor : " +getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
