package com.banking.customersservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageOut {
    private String code;
    @Builder.Default
    private boolean error = false;
    @Builder.Default
    private String message = null;
}
