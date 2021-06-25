package com.aiwa.atlighttestbackend.controller;

import com.aiwa.atlighttestbackend.model.CustomerMessage;
import com.aiwa.atlighttestbackend.service.CustomerMessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(path = "/api/messages")
public class CustomerMessageController {

    private final CustomerMessageServiceImpl mMessageService;

    @Autowired
    public CustomerMessageController(CustomerMessageServiceImpl messageService) {
        mMessageService = messageService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerMessage>> getMessages() {
        return new ResponseEntity<>(mMessageService.getAllMessages(), OK);
    }

    @PostMapping
    public ResponseEntity<CustomerMessage> addMessages(@RequestBody @Valid final CustomerMessage message) {
        return new ResponseEntity<>(mMessageService.saveMessage(message), CREATED);
    }
}
