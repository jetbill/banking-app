package com.banking.customersservice.service;


import com.banking.customersservice.model.Customer;
import com.banking.customersservice.model.dto.CustomerInfo;
import com.banking.customersservice.model.dto.CustomerResponse;
import com.banking.customersservice.repository.CustomerRepository;
import com.banking.customersservice.util.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;


    @Override
    public CustomerResponse saveCustomer(CustomerInfo customerInfo) {

          boolean isCustomer =  isCustomerExist(customerInfo.getEmail());
          if (!isCustomer){
              Customer customer = Customer.builder()
                      .code(customerInfo.getCode())
                      .email(customerInfo.getEmail())
                      .name(customerInfo.getName())
                      .password(customerInfo.getPassword())
                      .createAt(LocalDate.now())
                      .build();
              Customer customerSaved  = customerRepository.save(customer);
          }



        return CustomerMapper.modelToDto(customerSaved);
    }

    @Override
    public void deleteCustomer(long id) {

    }

    @Override
    public List<CustomerResponse> findAll() {
        return null;
    }

    @Override
    public Optional<Customer> findCustomerById(long id) {
        return Optional.empty();
    }

    @Override
    public CustomerResponse updateCustomer(CustomerInfo customerInfo, long id) {
        return null;
    }

    private boolean isCustomerExist(String email){
        Optional<Customer> customer = customerRepository.findByEmail(email);
        return customer.isPresent();
    }
}
