package com.javacertification.springboot.first.testapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World once again!";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "This is the about page. Thanks and see you next time!";
    }

}
