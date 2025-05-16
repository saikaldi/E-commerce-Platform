package com.codesaikal.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("Hello from controller!");

        model.addAttribute("name", "Mosh");

        return "index";
    }
}
