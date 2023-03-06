package com.banking.customersservice.util.mapper;

import com.banking.customersservice.model.Customer;
import com.banking.customersservice.model.dto.CustomerResponse;

public class CustomerMapper {
    public static CustomerResponse modelToDto(Customer customer){
         CustomerResponse customerResponse = CustomerResponse.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .code(customer.getCode())
                .createAt(customer.getCreateAt())
                .build();
        return customerResponse;
    }
}
