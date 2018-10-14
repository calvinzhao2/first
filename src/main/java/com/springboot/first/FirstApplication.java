package com.springboot.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }
    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }
    @RequestMapping("/word/{name}")
    String word(@PathVariable String name){
        return "word--spring boot:"+name;
    }
}
