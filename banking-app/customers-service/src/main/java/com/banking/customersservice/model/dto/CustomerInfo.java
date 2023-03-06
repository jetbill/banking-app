package com.banking.customersservice.model.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CustomerInfo {
    private String name;
    private String code;
    private String email;
    private String password;


}
