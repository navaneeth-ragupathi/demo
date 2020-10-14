package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Topic;
import com.example.demo.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
    @Autowired  /*look for instances of the service in registry */
    private TopicService topicService;
    
    @RequestMapping("/topics") /*maps the url to the below written view */
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics(); 
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(Topic topic) {
        topicService.addTopic(topic);
    }
}
