package com.seiji.order_service.config.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration 
public class KafkaConfig {
    
    private static final Integer PARTITION_COUNT = 1;
    private static final Integer REPLICA_COUNT = 1; 
    
    @Value("${spring.kafka.topic.start-saga}")
    private String startSagaTopic;

    @Value("${spring.kafka.topic.notify-ending}")
    private String notifyEnding;

    public NewTopic createTopic(String name) {
        return TopicBuilder.name(name)
                .partitions(PARTITION_COUNT)
                .replicas(REPLICA_COUNT)
                .build();
    }

    @Bean 
    public NewTopic startSagaTopic() {
        return createTopic(startSagaTopic);
    }

    @Bean 
    public NewTopic notifyEndingTopic() {
        return createTopic(notifyEnding);
    }

}
