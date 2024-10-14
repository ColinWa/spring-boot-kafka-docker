package com.nji.kafkadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDockerApplication.class, args);
    }

}
