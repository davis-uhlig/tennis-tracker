package com.example.tennis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by duhlig on 1/11/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/register")
    public String renderRegister() {
        return "register";
    }
}
