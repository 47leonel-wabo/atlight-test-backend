package com.aiwa.atlighttestbackend.service;

import com.aiwa.atlighttestbackend.model.CustomerMessage;

import java.util.List;

public interface CustomerMessageService {
    CustomerMessage saveMessage(CustomerMessage message);

    List<CustomerMessage> getAllMessages();

    void deleteMessageById(Long msgId);

    CustomerMessage getMessageById(Long id);
}
