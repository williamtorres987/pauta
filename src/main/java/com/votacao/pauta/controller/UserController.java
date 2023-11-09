package com.votacao.pauta.controller;

import com.votacao.pauta.models.User;
import com.votacao.pauta.service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.searchUser(id);
    }

    @PostMapping("/insert-user")
    public User insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
}

