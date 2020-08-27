package com.sumeyyeakay;

import com.sumeyyeakay.dto.KMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class KafkaListenerService {

    @KafkaListener(
            topics = "${sumeyyeakay.kafka.topic}",
            groupId = "${sumeyyeakay.kafka.group.id}"
        )
    public void listen(@Payload KMessage message) {
        log.info("Message received.. MessageID : {} Message: {} Date : {}",
        message.getId(),
        message.getMessage(),
        message.getMessageDate());
        }
}
