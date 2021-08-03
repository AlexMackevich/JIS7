package com.example.bankapp.controller;

import com.example.bankapp.entity.UserEntity;
import com.example.bankapp.repository.UserRepository;
import com.example.bankapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterPage (Model model){
        model.addAttribute("registerRequest", new UserEntity());
        return "register page";
    }

    @GetMapping("/login")
    public String getLoginPage (){
        return "login page";
    }

    @PostMapping("/register")
    public String  register(@ModelAttribute UserEntity userEntity){
        System.out.println("register request: " + userEntity);
        UserEntity registerUser = userService.registerUser(userEntity.getUserName(), userEntity.getPassword(), userEntity.getMail());
        return registerUser == null ? "error_page" : "redirect/login";
    }

    @PostMapping("/login")
    public String  login (@ModelAttribute UserEntity userEntity){
        System.out.println("login request: " + userEntity);
        UserEntity authenticationUser = userService.authenticationUser(userEntity.getUserName(), userEntity.getPassword());
        if (authenticationUser != null){
            return "user_page";
        } else {
            return "error_page";
        }
    }
}