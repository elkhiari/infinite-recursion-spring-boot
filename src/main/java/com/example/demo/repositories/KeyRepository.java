package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Key;

public interface KeyRepository extends JpaRepository<Key, Long> {
}
