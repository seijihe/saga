package com.seiji.product_validation_service.application.core;

import java.util.List;
import com.seiji.product_validation_service.application.core.enums.EEventSource;
import com.seiji.product_validation_service.application.core.enums.ESagaStatus;



public class Event {
    
    private String id;
    private String transactionId;
    private String orderId;
    private Order payload;
    private EEventSource source;
    private ESagaStatus status;
    private List<History> eventHistory;

}
