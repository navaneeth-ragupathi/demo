package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.JPARepositories.UserRepository;
import com.example.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        List<User> topics = new ArrayList<>();
        userRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<User> getUser(String id) {
        return userRepository.findById(id);
    }

    public void addTopic(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }
}
