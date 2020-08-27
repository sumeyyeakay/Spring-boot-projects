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





}
