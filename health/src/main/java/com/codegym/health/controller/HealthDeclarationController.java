package com.codegym.health.controller;

import com.codegym.health.model.HealthDeclaration;
import com.codegym.health.service.IHealthDeclarationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/health")
public class HealthDeclarationController {

    @Autowired
    private IHealthDeclarationService service;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("declaration", service.get());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(
            @Valid @ModelAttribute("declaration") HealthDeclaration declaration,
            BindingResult result) {

        if (result.hasErrors()) {
            return "form";
        }

        service.save(declaration);
        return "redirect:/health/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("declaration", service.get());
        return "view";
    }
}