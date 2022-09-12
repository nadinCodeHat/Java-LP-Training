package com.springmskafka.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEvent {
    private String message;
    private String status;
    private Customer customer;
}
