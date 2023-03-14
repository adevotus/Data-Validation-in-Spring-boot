package com.example.validation.controller;


import com.example.validation.dto.UserRequestDTO;
import com.example.validation.model.UserModel;
import com.example.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API")

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    public List<UserModel> findAllUsers() {
        return userService.getAllUsers();
    }

        @GetMapping("/user/{id}")
    public UserModel findUserById(@PathVariable int id) {
        return userService.getUserByID(id);
    }

    @PostMapping("/insert")
    public UserModel insertsers(@RequestBody @Valid UserRequestDTO userRequestDTO) {
        return userService.insertUser(userRequestDTO);
    }

}
