package com.seiji.product_validation_service.application.core.enums;

public enum EEventSource {
    
    ORCHESTRATOR("Orchestrator"),
    INVENTORY_SERVICE("Inventory Service"),
    PAYMENT_SERVICE("Payment Service"),
    PRODUCT_VALIDATION_SERVICE("Product Validation Service");

    private String service;

    private EEventSource(String service) {
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

}
