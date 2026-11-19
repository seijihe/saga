package com.seiji.order_service.adapters.out.producer;

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

    @Value("${spring.kafka.topic.start-saga}")
    private String startSagaTopic;

    public void runner(String payload) {
        try {

            log.info("Sending event to topic {} with data {}", 
                startSagaTopic, payload
            );
            
            template.send(startSagaTopic, payload);

        } catch(Exception ex) {

            log.error("Error trying to send data to topic {} with data {}: {}",
                startSagaTopic, payload, ex
            );

        } 
    }
    
}
