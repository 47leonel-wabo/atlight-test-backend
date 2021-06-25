package com.aiwa.atlighttestbackend.exception;

import java.time.LocalDate;

public class ExceptionModel {

    private final String message;
    private final String description;
    private final LocalDate timestamp;

    public ExceptionModel(String message,
                          String description,
                          LocalDate timestamp) {
        this.message = message;
        this.description = description;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }
}
