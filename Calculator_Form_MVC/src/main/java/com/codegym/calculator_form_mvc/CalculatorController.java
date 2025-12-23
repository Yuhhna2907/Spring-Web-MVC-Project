package com.codegym.calculator_form_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    public String showForm() {
        return "index";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operation") String operation,
                            Model model) {
        double result = 0;
        String label = "";

        switch (operation) {
            case "add":
                result = num1 + num2;
                label = "Addition";
                break;
            case "sub":
                result = num1 - num2;
                label = "Subtraction";
                break;
            case "mul":
                result = num1 * num2;
                label = "Multiplication";
                break;
            case "div":
                result = num2 != 0 ? num1 / num2 : 0;
                label = "Division";
                break;
        }

        model.addAttribute("label", label);
        model.addAttribute("result", result);
        return "result";
    }
}