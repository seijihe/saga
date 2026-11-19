package com.seiji.inventory_service.adapters.out.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@RequiredArgsConstructor 
public class SagaProducer {
    
    private KafkaTemplate<String, String> template;

    @Value("${spring.kafka.topic.orchestrator}")
    private String orchestrator;

    public void runner(String payload) {
        try {

            log.info("Sending event to topic {} with data {}", 
                orchestrator, payload
            );
            
            template.send(orchestrator, payload);

        } catch(Exception ex) {

            log.error("Error trying to send data to topic {} with data {}: {}",
                orchestrator, payload, ex
            );

        } 
    }

}
