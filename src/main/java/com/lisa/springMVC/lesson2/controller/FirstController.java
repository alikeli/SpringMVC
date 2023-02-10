package com.lisa.springMVC.lesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "/first1/hello";
    }
@GetMapping("/goodbye")
    public String goodByePAge() {
        return "/first1/goodbye";
    }


}
