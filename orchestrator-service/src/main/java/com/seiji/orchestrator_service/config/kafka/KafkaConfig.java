package com.seiji.orchestrator_service.config.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import static com.seiji.orchestrator_service.core.enums.ETopics.START_SAGA;
import static com.seiji.orchestrator_service.core.enums.ETopics.NOTIFY_ENDING;
import static com.seiji.orchestrator_service.core.enums.ETopics.BASE_ORCHESTRATOR;
import static com.seiji.orchestrator_service.core.enums.ETopics.FINISH_SUCESS;
import static com.seiji.orchestrator_service.core.enums.ETopics.FINISH_FAIL;
import static com.seiji.orchestrator_service.core.enums.ETopics.PRODUCT_VALIDATION_SUCESS;
import static com.seiji.orchestrator_service.core.enums.ETopics.PRODUCT_VALIDATION_FAIL;
import static com.seiji.orchestrator_service.core.enums.ETopics.PAYMENT_SUCESS;
import static com.seiji.orchestrator_service.core.enums.ETopics.PAYMENT_FAIL;
import static com.seiji.orchestrator_service.core.enums.ETopics.INVENTORY_SUCESS;
import static com.seiji.orchestrator_service.core.enums.ETopics.INVENTORY_FAIL;

@Configuration 
public class KafkaConfig {
    
    private static final Integer PARTITION_COUNT = 1;
    private static final Integer REPLICA_COUNT = 1; 

    public NewTopic createTopic(String name) {
        return TopicBuilder.name(name)
                .partitions(PARTITION_COUNT)
                .replicas(REPLICA_COUNT)
                .build();
    }

    @Bean 
    public NewTopic startSagaTopic() {
        return createTopic(START_SAGA.getTopic());
    }

    @Bean 
    public NewTopic notifyEndingTopic() {
        return createTopic(NOTIFY_ENDING.getTopic());
    }

    @Bean 
    public NewTopic baseOrchestratorTopic() {
        return createTopic(BASE_ORCHESTRATOR.getTopic());
    }

    @Bean 
    public NewTopic finishSucessTopic() {
        return createTopic(FINISH_SUCESS.getTopic());
    }

    @Bean 
    public NewTopic finishFailTopic() {
        return createTopic(FINISH_FAIL.getTopic());
    }

    @Bean 
    public NewTopic productValidationSucessTopic() {
        return createTopic(PRODUCT_VALIDATION_SUCESS.getTopic());
    }

    @Bean 
    public NewTopic productValidationFailTopic() {
        return createTopic(PRODUCT_VALIDATION_FAIL.getTopic());
    }


    @Bean 
    public NewTopic paymentSucessTopic() {
        return createTopic(PAYMENT_SUCESS.getTopic());
    }

    @Bean 
    public NewTopic paymentFailTopic() {
        return createTopic(PAYMENT_FAIL.getTopic());
    }

    @Bean 
    public NewTopic inventorySucessTopic() {
        return createTopic(INVENTORY_SUCESS.getTopic());
    }

    @Bean 
    public NewTopic inventoryFailTopic() {
        return createTopic(INVENTORY_FAIL.getTopic());
    }

}

