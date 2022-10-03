package com.emily.aulaAoVivo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDatails> handlerNotFoundException(NotFoundException ex) {
        ExceptionDatails exceptionDatails = ExceptionDatails.builder()
                .title("Objeto não encontrado :/")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(exceptionDatails, HttpStatus.NOT_FOUND);
    }

}