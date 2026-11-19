package com.seiji.product_validation_service.application.core;

import java.time.LocalDateTime;
import com.seiji.product_validation_service.application.core.enums.EEventSource;
import com.seiji.product_validation_service.application.core.enums.ESagaStatus;


public class History {
    
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createAt;

}
