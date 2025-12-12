package com.dylan.vanguard.controller;

// import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.vanguard.model.User;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class AuthController {
    

    @GetMapping
    public String authenticate(HttpServletRequest request){
        return "Authentication successful"+request.getSession().getId();
    }

    // @GetMapping("/csrf-token")
    // public CsrfToken getCsrf(HttpServletRequest request){
    //     return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    // }

    @PostMapping("/add")
    public String createUser(@RequestBody User user){

        User oldUser = new User();
        oldUser.setId(user.getId());
        oldUser.setUsername(user.getUsername());
        oldUser.setPassword(user.getPassword());

        
        return oldUser.toString();
    }
    
}
