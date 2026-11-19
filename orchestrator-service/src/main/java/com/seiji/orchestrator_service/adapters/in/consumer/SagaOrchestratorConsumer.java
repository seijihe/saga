package com.seiji.orchestrator_service.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@RequiredArgsConstructor 
public class SagaOrchestratorConsumer {

    @Value("${spring.kafka.topic.start-saga}")
    private String startSaga;

    @Value("${spring.kafka.topic.orchestrator}")
    private String orchestrator;

    @Value("${spring.kafka.topic.finish-success}")
    private String finishSuccess;

    @Value("${spring.kafka.topic.finish-fail}")
    private String finishFail;
    
    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.start-saga}"
    )
    public void consumeStartSagaEvent(String payload) {
        log.info("Receiving event {} from {} topic",
            payload, startSaga
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.orchestrator}"
    )
    public void consumeOrchestratorEvent(String payload) {
        log.info("Receiving event {} from {} topic",
            payload, orchestrator
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.finish-success}"
    )
    public void finishSucessEvent(String payload) {
        log.info("Receiving event {} from {} topic",
            payload, finishSuccess
        );
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}", 
        topics = "${spring.kafka.topic.finish-fail}"
    )
    public void finishSucessFail(String payload) {
        log.info("Receiving event {} from {} topic",
            payload, finishFail
        );
    }

}
