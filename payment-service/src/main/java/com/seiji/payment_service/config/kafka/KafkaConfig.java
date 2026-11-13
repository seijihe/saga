package com.seiji.payment_service.config.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration 
public class KafkaConfig {
    
    private static final Integer PARTITION_COUNT = 1;
    private static final Integer REPLICA_COUNT = 1; 
    
    @Value("${spring.kafka.topic.orchestrator}")
    private String orchestratorTopic;

    @Value("${spring.kafka.topic.payment-success}")
    private String paymentSucessTopic;

    @Value("${spring.kafka.topic.payment-fail}")
    private String paymentFailTopic;

    public NewTopic createTopic(String name) {
        return TopicBuilder.name(name)
                .partitions(PARTITION_COUNT)
                .replicas(REPLICA_COUNT)
                .build();
    }

    @Bean 
    public NewTopic orchestratorTopic() {
        return createTopic(orchestratorTopic);
    }

    @Bean 
    public NewTopic paymentSucessTopic() {
        return createTopic(paymentSucessTopic);
    }

    @Bean 
    public NewTopic paymentFailTopic() {
        return createTopic(paymentFailTopic);
    }
    
}
