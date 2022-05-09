package com.example.accountservice.service.impl;

import com.example.accountservice.dto.AccountDto;
import com.example.accountservice.entity.Account;
import com.example.accountservice.repository.AccountRepository;
import com.example.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    @Override
    public AccountDto findAccountById(String id) {
        var account = accountRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("Account not found!")
                );

        return modelMapper.map(account, AccountDto.class);
    }

    @Override
    @Transactional
    public AccountDto createAccount(AccountDto account) {
        var acc = modelMapper.map(account, Account.class);
        accountRepository.save(acc);
        return modelMapper.map(acc, AccountDto.class);
    }

    @Override
    @Transactional
    public AccountDto updateAccount(String id, AccountDto accountDto) {
//        Assert.isNull(id, "Id cannot be  null");
        var acc = accountRepository.findById(id);
        var savingAcc = acc.map(account -> {
            account.setUsername(accountDto.getUsername());
            account.setEmail(accountDto.getEmail());
            account.setPassword(accountDto.getPassword());
            return account;
        }).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(accountRepository.save(savingAcc), AccountDto.class);
    }

    @Override
    public List<AccountDto> findAll() {
        var accounts = accountRepository.findAll();
        return accounts.stream()
                .map(acc -> modelMapper.map(acc, AccountDto.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteAccountById(String id) {
        var account = accountRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("Account not found!")
                );
        accountRepository.delete(account);
    }
}
