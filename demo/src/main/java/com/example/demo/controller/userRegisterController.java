package com.example.demo.controller;

import com.example.demo.User.Dto.UserRegisterDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class userRegisterController {
    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegisterDTO returnNewUserRegisterDTO(){
        return new UserRegisterDTO();
    }

    @GetMapping
    public String showFormularyRegister(){
        return "register";
    }

    @PostMapping
    public String registerCountUser(@ModelAttribute("user") UserRegisterDTO registerDTO ){
        userService.save(registerDTO);
        return "redirect:/register?congratulations";
    }

}
