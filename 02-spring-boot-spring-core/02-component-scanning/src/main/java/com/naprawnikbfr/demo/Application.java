package com.naprawnikbfr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {	"com.naprawnikbfr.demo",
//								"com.naprawnikbfr.util"})

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
