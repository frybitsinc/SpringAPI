package com.frybitsinc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.frybitsinc.thymeleaf.model.Car;

@Controller
@RequestMapping("/")
public class HelloController{

    @GetMapping
    public String index(Model model) {
        model.addAttribute("car", new Car());
        return "index";
    }

    @PostMapping
    public String saved(Car car, Model model) {
        model.addAttribute("car", car);
        return "saved";
    }
}
