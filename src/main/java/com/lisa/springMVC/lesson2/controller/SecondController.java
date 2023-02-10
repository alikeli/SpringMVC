package com.lisa.springMVC.lesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "/second1/exit";
    }
}
