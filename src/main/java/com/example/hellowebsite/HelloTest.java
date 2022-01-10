package com.example.hellowebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloTest {
    @RequestMapping("/hello")
    public String hello1(){
        return "hello";
    }
}
