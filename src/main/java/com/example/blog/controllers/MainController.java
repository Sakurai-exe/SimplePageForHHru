package com.example.blog.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "MainPage");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "SomePage");
        return "about";
    }

    

}