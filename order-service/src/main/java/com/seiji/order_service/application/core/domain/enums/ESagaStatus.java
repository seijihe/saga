package com.seiji.order_service.application.core.domain.enums;

public enum ESagaStatus {
    
    SUCCESS("Success"),
    ROLLBACK_PENDING("Rollback Pending"),
    FAIL("Fail");

    private ESagaStatus(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus(String status) {
        return status;
    }

}
