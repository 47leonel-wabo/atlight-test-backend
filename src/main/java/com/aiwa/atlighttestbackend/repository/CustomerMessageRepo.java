package com.aiwa.atlighttestbackend.repository;

import com.aiwa.atlighttestbackend.model.CustomerMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMessageRepo extends JpaRepository<CustomerMessage, Long> {
}
