package com.banking.customersservice.service;

import com.banking.customersservice.model.Customer;
import com.banking.customersservice.model.dto.CustomerInfo;
import com.banking.customersservice.model.dto.CustomerResponse;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerResponse saveCustomer(CustomerInfo customerInfo);
    void deleteCustomer(long id);
    List<CustomerResponse> findAll();
    Optional<Customer> findCustomerById(long id);
    CustomerResponse updateCustomer(CustomerInfo customerInfo, long id);

}
