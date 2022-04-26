package com.example.accountservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDto {

    private String id;

    private String username;

    private String email;

    private String password;

    private LocalDateTime createdAt;

    private Boolean active;

}
