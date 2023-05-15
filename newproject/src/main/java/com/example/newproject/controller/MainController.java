package com.example.newproject.controller;

import com.example.newproject.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/welcome")
    public String welcomePage()
    {
        return "welcomepage.html";
    }

    @PostMapping("/registration")
    public String addRegistration(@ModelAttribute Mail mail)
    {
        return "registration.html";
    }

}
