package com.seiji.payment_service.application.core.domain;

import java.time.LocalDateTime;
import com.seiji.payment_service.application.core.domain.enums.ESagaStatus;
import com.seiji.payment_service.application.core.domain.enums.EEventSource;

public class History {
    
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createAt;

}
