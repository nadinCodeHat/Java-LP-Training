package com.springmskafka.emailservice.kafka;

import com.springmskafka.basedomains.dto.CustomerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(CustomerEvent event) {
        LOGGER.info(String.format("Withdraw event received in email service => %s", event.toString()));
    }
}
