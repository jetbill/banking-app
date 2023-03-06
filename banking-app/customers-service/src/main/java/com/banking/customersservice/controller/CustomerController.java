package com.banking.customersservice.controller;

import com.banking.customersservice.service.CustomerService;
import com.banking.customersservice.model.MessageOut;
import com.banking.customersservice.model.dto.CustomerInfo;
import com.banking.customersservice.model.dto.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomerApi {
    private final CustomerService customerService;


    @Override
    public ResponseEntity<CustomerResponse> createCustomer(CustomerInfo customerInfo) {
        return null;
    }

    @Override
    public ResponseEntity<MessageOut> updateCustomer(CustomerInfo customerInfo, long customerId) {
        return null;
    }
}
