package com.aiwa.atlighttestbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = {AppException.class})
    public ResponseEntity<Object> handleApiRequestException(AppException exception) {
        ExceptionModel exceptionModel = new ExceptionModel(
                exception.getMessage(),
                "That is a bad request",
                LocalDate.now());
        return new ResponseEntity<>(exceptionModel, BAD_REQUEST);
    }

}
