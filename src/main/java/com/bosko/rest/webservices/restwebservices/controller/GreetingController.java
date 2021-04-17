package com.bosko.rest.webservices.restwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GreetingController {

//    @GetMapping("/hello-world")
//    public GreetingMessageBean helloWorldBean() {
//        return new GreetingMessageBean("Hello World");
//    }

    @GetMapping("/greeting/{name}")
    public GreetingMessageBean greetingPathVariable(@PathVariable String name) {
        return new GreetingMessageBean(String.format("Hi, %s", name +". Welcome to the To Do application."));
    }
}
