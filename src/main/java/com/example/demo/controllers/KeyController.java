package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Key;
import com.example.demo.services.KeyServices;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/key")
public class KeyController {
    private final KeyServices keyServices;
    
    @PostMapping("/save")
    public ResponseEntity<Key> save(@RequestBody Key key) {
        return ResponseEntity.ok(keyServices.save(key));
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Key>> findAll() {
        return ResponseEntity.ok(keyServices.findAll());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Key> findById(@PathVariable Long id) {
        return ResponseEntity.ok(keyServices.findById(id));
    }
}
