package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//data service
public interface TopicRepository extends JpaRepository<Topic,String> {

    //Topic findOne(String id);
    //Topic delete(String id);


    //getAllTopics
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)

    //CRUD OPERATION



}
