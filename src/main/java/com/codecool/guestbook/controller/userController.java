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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/users")
public class userController {
    private userService userService;

    //TEMP
    List<User> tempUserList = Stream.of(
            new User(1, "name1", "lalalala"),
            new User(2,"name2", "blebleble" )
    ).collect(Collectors.toList());

    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String users(Model model) {
//        model.addAttribute("users", userService.getUsers());
        model.addAttribute("users", tempUserList);

        UserCreationDto userForm = new UserCreationDto();
        userForm.addUser(new User());
//        model.addAttribute("form", userForm);
        model.addAttribute("user", new User());


        return "allUsers";
    }

    @PostMapping
    public String addNew(@ModelAttribute User user, Model model) {
        tempUserList.add(user);
        model.addAttribute("users", tempUserList);
//        model.addAttribute("users", userService.getUsers());

//        form.addUser(new User());
//        User user = form.getUsers().get(0);
//        userService.addUser(user);

        return "allUsers";
    }

//    @GetMapping("/add")
//    public String usersUpdated(Model model) {
//        UserCreationDto userForm = new UserCreationDto();
//        userForm.addUser(new User());
//        model.addAttribute("form", userForm);
//
//        return "allUsers";
//    }
}
