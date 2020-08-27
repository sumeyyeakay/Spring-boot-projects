package com.sumeyyeakay.service;

import com.sumeyyeakay.model.Course;
import com.sumeyyeakay.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * business servers
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add); //Lambda used
         return courses;
    }
    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);

    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(String id , Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
