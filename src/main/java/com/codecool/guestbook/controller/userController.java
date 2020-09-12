package com.codecool.guestbook.controller;

import com.codecool.guestbook.dto.UserCreationDto;
import com.codecool.guestbook.model.User;
import com.codecool.guestbook.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class userController {
    private userService userService;

    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String users(Model model) {
        UserCreationDto userForm = new UserCreationDto();
        userForm.addUser(new User());
        model.addAttribute("form", userForm);


        model.addAttribute("users", userService.getUsers());
        return "allUsers";
    }

    @PostMapping
    public String addNew(@ModelAttribute UserCreationDto form, Model model) {
        User user = form.getUsers().get(0);
        userService.addUser(user);

        model.addAttribute("users", userService.getUsers());
        return "allUsers";
    }

    @GetMapping("/add")
    public String usersUpdated(Model model) {
        UserCreationDto userForm = new UserCreationDto();
        userForm.addUser(new User());
        model.addAttribute("form", userForm);

        return "allUsers";
    }


}
