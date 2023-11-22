package com.example.demo.controllers;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserServices;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServices userServices;

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userServices.save(user));
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userServices.findAll());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userServices.findById(id));
    }
}
