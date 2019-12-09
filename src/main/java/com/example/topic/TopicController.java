package com.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicsService topicsService;

    @GetMapping("/topics")
    public List<Topic> all_topics(){
        return topicsService.getAllTopicList();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicsService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
        topicsService.addTopic(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable("id") String id){
        topicsService.deleteTopic(id);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicsService.updateTopic(topic, id);
    }
}
