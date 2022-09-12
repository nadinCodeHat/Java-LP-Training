package com.springmskafka.customerservice.controller;

import com.springmskafka.basedomains.dto.Customer;
import com.springmskafka.basedomains.dto.CustomerEvent;
import com.springmskafka.customerservice.kafka.CustomerProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private CustomerProducer customerProducer;

    public CustomerController(CustomerProducer customerProducer) {
        this.customerProducer = customerProducer;
    }

    @PostMapping("/customers")
    public String placeWithdrawal(@RequestBody Customer customer) {
        customer.setCustomerId(UUID.randomUUID().toString());
        CustomerEvent customerEvent = new CustomerEvent();
        customerEvent.setStatus("PENDING");
        customerEvent.setMessage("Withdrawal status is pending");
        customerEvent.setCustomer(customer);
        customerProducer.sendMessage(customerEvent);
        return "Withdrawal placed successfully";
    }
}
