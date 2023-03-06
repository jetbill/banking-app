package com.banking.customersservice.controller;


import com.banking.customersservice.model.MessageOut;
import com.banking.customersservice.model.dto.CustomerInfo;
import com.banking.customersservice.model.dto.CustomerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/customers")
public interface CustomerApi {
    @PostMapping
    ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerInfo customerInfo);

    @PatchMapping("/status/{customerId}")
    ResponseEntity<MessageOut> updateCustomer(@RequestBody CustomerInfo customerInfo, @PathVariable long customerId);
}
