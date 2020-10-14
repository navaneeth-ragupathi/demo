package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    
    @Autowired  /*look for instances of the service in registry */
    private UserService userService;
    
    @RequestMapping("/users") /*maps the url to the below written view */
    public List<User> getAllUsers(){
        return userService.getAllUsers(); 
    }

    @RequestMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(User user) {
        userService.addTopic(user);
    }
}
