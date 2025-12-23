package com.sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class CondimentController {

    @RequestMapping("/")
    public String showForm() {
        return "condimentForm";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("selectedCondiments", condiment);
        return "result";
    }
}

