package com.example.demo.services;

import com.example.demo.entities.Key;
import com.example.demo.repositories.KeyRepository;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KeyServices {
    private final KeyRepository keyRepository;

    public Key save(Key key) {
        return keyRepository.save(key);
    }

    public Key findById(Long id) {
        return keyRepository.findById(id).orElseThrow();
    }

    public List<Key> findAll() {
        return keyRepository.findAll();
    }
    
}
