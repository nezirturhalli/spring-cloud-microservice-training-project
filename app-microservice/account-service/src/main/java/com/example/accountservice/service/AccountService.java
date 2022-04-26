package com.example.accountservice.service;


import com.example.accountservice.dto.AccountDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {
    AccountDto findAccountById(String id);

    AccountDto createAccount(AccountDto account);

    void deleteAccountById(String id);

    AccountDto updateAccount(String id, AccountDto account);

    List<AccountDto> findAll(Pageable pageable);
}