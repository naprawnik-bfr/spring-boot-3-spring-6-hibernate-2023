package com.naprawnikbfr.demo.rest;

import com.naprawnikbfr.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    //setter injection
    @Autowired
    public void setMyCoach (Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
