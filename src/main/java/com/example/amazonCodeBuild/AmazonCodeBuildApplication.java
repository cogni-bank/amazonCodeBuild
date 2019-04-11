package com.example.amazonCodeBuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AmazonCodeBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonCodeBuildApplication.class, args);
	}

}

@RestController
class TestController{

	@GetMapping("/")
	public String test(){
		return " YOUR LOAD BALANCER IS NOT ABLE TO HIT ANY TARGET GROUP.. THIS IS THE DEFAULT TARGET GROUP";
	}

	@GetMapping("/helloWorld")
	public String test123(){
		return "holla world.....";
	}

}
