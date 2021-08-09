package com.example.bankapp.controller;

import com.example.bankapp.entity.UserEntity;
import com.example.bankapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/register")
    public String getRegisterPage (Model model){
        model.addAttribute("registerRequest", new UserEntity());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage (Model model){

        model.addAttribute("loginRequest", new UserEntity());
        return "login_page";
    }

    @PostMapping("/register")
    public String  register(@ModelAttribute UserEntity userEntity){
        System.out.println("registerRequest: " + userEntity);
        UserEntity registerUser = userService.registerUser(userEntity.getLogin(), userEntity.getPassword(), userEntity.getMail());
        return registerUser == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String  login (@ModelAttribute UserEntity userEntity, Model model){
        System.out.println("loginRequest: " + userEntity);
        UserEntity authenticationUser = userService.authenticationUser(userEntity.getLogin(), userEntity.getPassword());
        if (authenticationUser != null){
            model.addAttribute("userLogin", authenticationUser.getLogin());
            return "user_page";
        } else {
            return "error_page";
        }
    }
    @GetMapping("/addInformation")
    public String getAddInformation (Model model){
        model.addAttribute("addInformationRequest", new UserEntity());
        return "addInformation_page";
    }

    @PostMapping("/addInformation")
    public String  addInformation (@ModelAttribute UserEntity userEntity, Model model){
        System.out.println("addInformationRequest: " + userEntity);
        UserEntity updateUser = userService.update(userEntity.getFirstName(), userEntity.getLastName(), userEntity.getPhoneNumber());
        return updateUser == null ? "error_page" : "redirect:/user_page";
    }
}
