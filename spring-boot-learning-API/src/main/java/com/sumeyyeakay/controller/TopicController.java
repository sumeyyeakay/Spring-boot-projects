package com.sumeyyeakay.controller;

import com.sumeyyeakay.model.Topic;
import com.sumeyyeakay.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

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
    //servisi tanimladik
    @Autowired
    private TopicService topicService;

    //GET
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        //service v icinde yazdigimiz metodu donduruyoruz.
        return topicService.getAllTopics();
    }

    //GET
    @RequestMapping("/topics/{id}")
    //id degiscek demek verdigim id ye gore getir PathVariable
    public Optional<Topic> getTopic(@PathVariable String id) {
        return  topicService.getTopic(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST , value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //UPDATE
    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
    //id uzerinden islem yapacagimiz icin onu da metod parametresi olarak verdik
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    //DELETE
    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
    //id uzerinden islem yapacagimiz icin onu da metod parametresi olarak verdik
    public void deleteTopic( @PathVariable String id){
        topicService.deleteTopic(id);
    }
}
