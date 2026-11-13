package com.seiji.orchestrator_service.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor 
public enum ETopics {
    
    START_SAGA("start-saga"),
    NOTIFY_ENDING("notify-ending"),

    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCESS("finish-success"), // Orchestrator consumer and producer
    FINISH_FAIL("finish-fail"),

    PRODUCT_VALIDATION_SUCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_SUCESS("payment-success"),
    PAYMENT_FAIL("payment-fail"),
    INVENTORY_SUCESS("inventory-success"),
    INVENTORY_FAIL("inventory-fail");
    
    private String topic;
    
}
