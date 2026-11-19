package com.seiji.product_validation_service.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@RequiredArgsConstructor 
public class ProductValidationConsumer {

    @Value("${spring.kafka.topic.product-validation-success}")
    private String productValidationSuccess;

    @Value("${spring.kafka.topic.product-validation-fail}")
    private String productValidationFail;
    
    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.product-validation-success}"
    )
    public void consumeSucessEvent(String payload) {
        log.info("Receiving sucess event {} from {} topic",
            payload, productValidationSuccess
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.product-validation-fail}"
    )
    public void consumeFailEvent(String payload) {
        log.info("Receiving rollback event {} from {} topic",
            payload, productValidationFail
        );
    }

}
