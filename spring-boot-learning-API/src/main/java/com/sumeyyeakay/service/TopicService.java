package com.sumeyyeakay.service;

import com.sumeyyeakay.model.Topic;
import com.sumeyyeakay.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * business servers
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //GET
    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add); //Lambda used
        return topics;
    }
    //GET
    public Optional<Topic> getTopic(String id) {
        //sectigim id ye gore filtrele ve getir
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        return topicRepository.findById(id);

    }

    //POST
    public void addTopic(Topic topic) {
       // topics.add(topic);
        topicRepository.save(topic);
    }

    //UPDATE -> PUT
    public void updateTopic(String id , Topic topic) {
       /**
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
        */

       topicRepository.save(topic);

    }
    //DELETE
    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
