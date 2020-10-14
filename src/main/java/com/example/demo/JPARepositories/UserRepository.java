package com.example.demo.JPARepositories;

import com.example.demo.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    
}