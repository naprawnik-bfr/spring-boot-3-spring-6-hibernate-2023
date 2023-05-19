package com.naprawnikbfr.demo.springboot3quickstart.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

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
