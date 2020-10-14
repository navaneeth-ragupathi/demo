package com.example.demo.JPARepositories;

import com.example.demo.entity.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    
}
