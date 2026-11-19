package com.seiji.payment_service.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@RequiredArgsConstructor 
public class PaymentConsumer {

    @Value("${spring.kafka.topic.payment-success}")
    private String paymentSuccess;

    @Value("${spring.kafka.topic.payment-fail}")
    private String paymentFail;
    
    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.payment-success}"
    )
    public void consumeSucessEvent(String payload) {
        log.info("Receiving sucess event {} from {} topic",
            payload, paymentSuccess
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.payment-fail}"
    )
    public void consumeFailEvent(String payload) {
        log.info("Receiving rollback event {} from {} topic",
            payload, paymentFail
        );
    }
    
}
