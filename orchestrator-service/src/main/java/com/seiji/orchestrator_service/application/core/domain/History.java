package com.seiji.orchestrator_service.application.core.domain;

import java.time.LocalDateTime;
import com.seiji.orchestrator_service.application.core.domain.enums.EEventSource;
import com.seiji.orchestrator_service.application.core.domain.enums.ESagaStatus;


public class History {
    
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createAt;

}
