package com.naprawnikbfr.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //inject properties from app.properties:

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name: " + coachName + ", team name: " + teamName;
    }

    //expose "/" endpoint and return "Hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world.";
    }

    //expose "/" endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5k.";
    }

    //expose "/" endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }

}
