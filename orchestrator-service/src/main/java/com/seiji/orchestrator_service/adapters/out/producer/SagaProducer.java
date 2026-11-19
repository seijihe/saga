package com.seiji.orchestrator_service.adapters.out.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Component 
@AllArgsConstructor 
public class SagaProducer {
    
    private KafkaTemplate<String, String> template;

    public void runner(String payload, String topic) {
        try {

            log.info("Sending event to topic {} with data {}", 
                topic, payload
            );
            
            template.send(topic, payload);

        } catch(Exception ex) {

            log.error("Error trying to send data to topic {} with data {}: {}",
                topic, payload, ex
            );

        } 
    }

}
