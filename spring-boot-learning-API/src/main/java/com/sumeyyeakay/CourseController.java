package com.sumeyyeakay;

import com.sumeyyeakay.model.Course;
import com.sumeyyeakay.model.Topic;
import com.sumeyyeakay.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    /**
     * model donuyor List seklinde
     * bu nedenle;
     * @return Arrays.asList ile deger verip gorelim diyoruz ilk etapta
     *
     *
     *  return Arrays.asList(
     *                 new Topics("spring", "Spring Framework", "spring framework Description"),
     *                 new Topics("java", "Spring Framework", "spring framework Description"),
     *                 new Topics("spring", "Spring Framework", "spring framework Description")
     *         );
     */

    @Autowired
    private CourseService courseService;

    //GET
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    //GET
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id) {
        return  courseService.getCourse(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST , value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "" , ""));
        courseService.addCourse(course);
    }

    //UPDATE
    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId , @PathVariable String id){
        course.setTopic(new Topic(topicId, "" , ""));
        courseService.updateCourse(id,course);
    }

    //DELETE
    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse( @PathVariable String id , @PathVariable String topicId ){
        courseService.deleteCourse(id);
    }
}