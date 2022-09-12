package com.springmskafka.customerservice.kafka;

import com.springmskafka.basedomains.dto.CustomerEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CustomerProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustomerProducer.class);

    private NewTopic topic;

    private KafkaTemplate<String, CustomerEvent> kafkaTemplate;

    public CustomerProducer(NewTopic topic, KafkaTemplate<String, CustomerEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CustomerEvent event) {
        LOGGER.info(String.format("Customer event => %s", event.toString()));

        // Create a message
        Message<CustomerEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }
}
