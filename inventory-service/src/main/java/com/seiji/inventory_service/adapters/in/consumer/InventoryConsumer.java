package com.seiji.inventory_service.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@RequiredArgsConstructor 
public class InventoryConsumer {

    @Value("${spring.kafka.topic.inventory-success}")
    private String inventorySuccess;

    @Value("${spring.kafka.topic.inventory-fail}")
    private String inventoryFail;
    
    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.inventory-success}"
    )
    public void consumeSucessEvent(String payload) {
        log.info("Receiving sucess event {} from {} topic",
            payload, inventorySuccess
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.inventory-fail}"
    )
    public void consumeFailEvent(String payload) {
        log.info("Receiving rollback event {} from {} topic",
            payload, inventoryFail
        );
    }
    
}
