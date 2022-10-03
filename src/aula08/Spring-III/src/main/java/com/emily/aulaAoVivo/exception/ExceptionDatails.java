package com.emily.aulaAoVivo.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDatails {
    private String title;
    private int status;
    private String message;
    private LocalDateTime timeStamp;
}
