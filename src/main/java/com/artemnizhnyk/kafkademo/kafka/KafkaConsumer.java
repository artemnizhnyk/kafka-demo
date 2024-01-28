package com.artemnizhnyk.kafkademo.kafka;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-test", groupId = "my_consumer")
    public void listen(final String message) {
        log.info("Received message: " + message);
    }
}
