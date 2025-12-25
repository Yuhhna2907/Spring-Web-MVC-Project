package com.codegym.mailsettings.controller;

import com.codegym.mailsettings.model.MailSettings;
import com.codegym.mailsettings.service.IMailSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/settings")
public class MailSettingsController {

    @Autowired
    private IMailSettingsService mailSettingsService;

    @GetMapping
    public String showSettings(Model model) {
        model.addAttribute("settings", mailSettingsService.getSettings());
        return "settings";
    }

    @PostMapping("/update")
    public String updateSettings(@ModelAttribute("settings") MailSettings settings, Model model) {
        mailSettingsService.updateSettings(settings);
        model.addAttribute("message", "Update successful!");
        return "settings";
    }
}
