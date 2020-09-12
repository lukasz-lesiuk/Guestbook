package com.codecool.guestbook.controller;

import com.codecool.guestbook.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
    private userService userService;

    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "allUsers";
    }

}
