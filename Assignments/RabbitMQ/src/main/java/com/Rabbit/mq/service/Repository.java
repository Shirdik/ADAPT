package com.Rabbit.mq.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Rabbit.mq.dto.Customer;

public interface Repository extends MongoRepository<Customer, String> {

}
