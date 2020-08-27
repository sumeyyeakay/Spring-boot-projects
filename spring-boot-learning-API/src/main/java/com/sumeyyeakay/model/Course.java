package com.sumeyyeakay.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    //fk var diyoruz
    @ManyToOne
    private Topic topic;


    public Course() {
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.id = id;
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

}
