package com.banking.customersservice.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CustomerResponse {
    private String name;
    private String code;
    private String email;
    private LocalDate createAt;

}
