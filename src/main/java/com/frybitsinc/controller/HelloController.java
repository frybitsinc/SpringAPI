package com.frybitsinc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.frybitsinc.thymeleaf.model.Car;

@Controller
@RequestMapping({ "/", "/index" })
public class HelloController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("car", new Car());
        return "index";
    }

    @PostMapping
    public String save(Car car, Model model) {
        model.addAttribute("car", car);
        return "saved";
    }
}
