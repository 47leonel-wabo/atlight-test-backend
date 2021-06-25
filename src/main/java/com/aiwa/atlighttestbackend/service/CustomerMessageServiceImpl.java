package com.aiwa.atlighttestbackend.service;

import com.aiwa.atlighttestbackend.exception.AppException;
import com.aiwa.atlighttestbackend.model.CustomerMessage;
import com.aiwa.atlighttestbackend.repository.CustomerMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerMessageServiceImpl implements CustomerMessageService {

    private final CustomerMessageRepo mCustomerMessageRepo;

    @Autowired
    public CustomerMessageServiceImpl(CustomerMessageRepo customerMessageRepo) {
        mCustomerMessageRepo = customerMessageRepo;
    }

    @Override
    public CustomerMessage saveMessage(final CustomerMessage message) {
        return mCustomerMessageRepo.save(message);
    }

    @Override
    public List<CustomerMessage> getAllMessages() {
        return mCustomerMessageRepo.findAll();
    }

    @Override
    public void deleteMessageById(final Long msgId) {
        mCustomerMessageRepo.deleteById(msgId);
    }

    @Override
    public CustomerMessage getMessageById(final Long id) {
        Optional<CustomerMessage> optionalCustomerMessage = mCustomerMessageRepo.findById(id);
        if (optionalCustomerMessage.isEmpty()) {
            throw new AppException("Message with Id " + id + " not found!");
        }
        return optionalCustomerMessage.get();
    }

    // TODO: implement other CRUD methods and business logic
}
