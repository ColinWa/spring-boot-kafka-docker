package com.nji.kafkadocker.controller;

import com.nji.kafkadocker.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private final KafkaProducer kafkaProducer = new KafkaProducer();

    @PostMapping("/publish")
    public void publishMessage() {
        kafkaProducer.sendMessage("Hello Kafka World!");
    }
}
