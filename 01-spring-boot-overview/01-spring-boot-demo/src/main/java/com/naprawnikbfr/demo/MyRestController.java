package com.naprawnikbfr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //expose "/" endpoint and return "Hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }
}
