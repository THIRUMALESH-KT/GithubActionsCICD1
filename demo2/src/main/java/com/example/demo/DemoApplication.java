package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/welcome")
	public ResponseEntity<Object> welcome(){
		return ResponseEntity.ok("welcome Venkat and Chandu");
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
