package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadFormPage(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }

    @PostMapping("/carform")
    public String loadFrompage(@ModelAttribute Car car, Model model) {
        model.addAttribute("car", car);
        return "confirmcar";
    }
}
