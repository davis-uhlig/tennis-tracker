package com.example.tennis.controller;

import com.example.tennis.model.User;
import com.example.tennis.repository.MatchRepository;
import com.example.tennis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.http.HttpSession;

/**
 * Created by duhlig on 1/11/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepo;

    @GetMapping("/register")
    public String renderRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(String firstName, String lastName, String email, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));

        User newUser = new User();
        newUser.setFistName(firstName);
        newUser.setLastName(lastName);
        newUser.setEmail(email);
        newUser.setPassword(hashedPassword);

        userRepo.save(newUser);

        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public String renderLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String email, String password, HttpSession session, Model model) {
        User currentUser = userRepo.findByEmail(email);

        if (currentUser == null) {
            String errorMessage = "the username and/or password is incorrect";
            model.addAttribute("error", errorMessage);
            return "login";
        }

        if (BCrypt.checkpw(password, currentUser.getPassword())) {
            session.setAttribute("userId", currentUser.getUserId());
            return "redirect:/user/view-matches";
        }
        return "redirect:/user/login";
    }

}
