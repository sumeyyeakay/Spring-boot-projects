package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//data service
public interface CourseRepository extends JpaRepository<Course,String> {

    //Topic findOne(String id);
    //Topic delete(String id);
    //getAllTopics
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)
    //CRUD OPERATION

    public List<Course> findByTopicId(String topicId);


}
