package com.codegym.nasahibernateorm.controller;

import com.codegym.nasahibernateorm.model.Feedback;
import com.codegym.nasahibernateorm.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class NasaController {
    @Autowired
    private FeedbackService service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("feedback", new Feedback());
        model.addAttribute("list", service.findToday());
        return "nasa";
    }

    @PostMapping("/comment")
    public String comment(@ModelAttribute Feedback feedback) {
        service.save(feedback);
        return "redirect:/";
    }

    @GetMapping("/like/{id}")
    public String like(@PathVariable Long id) {
        service.like(id);
        return "redirect:/";
    }
}
