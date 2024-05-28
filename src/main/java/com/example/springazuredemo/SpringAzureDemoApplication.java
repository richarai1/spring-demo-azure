package com.example.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
  @GetMapping("/message")
    public String  onMessage(){
        return "Heyyy";
    }
    @GetMapping("/hello")
    public String  onMessage1(){
        return "Test";
    }
    @GetMapping("/test")
    public String  onMessage2(){
        return "Test";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
