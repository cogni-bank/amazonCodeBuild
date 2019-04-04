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

	@GetMapping("/hello")
	public String test(){
		return "holla";
	}

	@GetMapping("/helloWorld")
	public String test123(){
		return "holla world.....";
	}

}
