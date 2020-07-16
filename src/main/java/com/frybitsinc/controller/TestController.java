package com.frybitsinc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.frybitsinc.thymeleaf.model.Car;

@Controller
@RequestMapping("/test")
public class TestController{

    @GetMapping
    public String test(Model model) {
        model.addAttribute("car", new Car());
        return "test";
    }

    @PostMapping
    public String t_saved(Car car, Model model) {
        model.addAttribute("car", car);
        return "t_saved";
    }
}
