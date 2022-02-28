package com.example.signup_login_assignment.controller;

import com.example.signup_login_assignment.dto.UserDto;
import com.example.signup_login_assignment.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("user/details")
    public String registration(@RequestBody UserDto userDto){
        return userService.userRegistration(userDto);
    }
    @GetMapping("user/login/{email}/{password}")
    String login(@PathVariable String email, @PathVariable String password){
        return userService.login(email,password);
    }
}
