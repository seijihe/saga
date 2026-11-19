package com.seiji.order_service.application.core.domain;

import java.time.LocalDateTime;
import com.seiji.order_service.application.core.domain.enums.EEventSource;
import com.seiji.order_service.application.core.domain.enums.ESagaStatus;


public class History {
    
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createAt;

}
