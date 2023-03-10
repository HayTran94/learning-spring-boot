package com.example.controller;

import com.example.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home(@RequestParam(value = "name")String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/profile")
    public String profile(@RequestParam(value = "name") String name, Model model) {
        Customer customer = new Customer("hay", "tv");
        model.addAttribute("profile", customer);
        return "profile";
    }
}
