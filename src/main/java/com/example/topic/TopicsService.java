package com.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopicList(){
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }
}
