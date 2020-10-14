package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.demo.JPARepositories.TopicRepository;
import com.example.demo.entity.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service /* acts as singleton class which is instantiated once and used across code */
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "spring", "Spring")));*/

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic){
        topicRepository.save(topic);
    }
}
