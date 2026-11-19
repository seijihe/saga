package com.seiji.inventory_service.application.core.domain;

import java.util.List;
import com.seiji.inventory_service.application.core.domain.enums.EEventSource;
import com.seiji.inventory_service.application.core.domain.enums.ESagaStatus;

public class Event {
    
    private String id;
    private String transactionId;
    private String orderId;
    private Order payload;
    private EEventSource source;
    private ESagaStatus status;
    private List<History> eventHistory;

}
