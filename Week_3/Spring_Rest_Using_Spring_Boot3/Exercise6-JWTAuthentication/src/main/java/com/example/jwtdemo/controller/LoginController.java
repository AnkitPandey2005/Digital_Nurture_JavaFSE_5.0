package com.example.jwtdemo.controller;

import com.example.jwtdemo.model.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            return "Login Successful";

        }

        return "Invalid Username or Password";
    }

}