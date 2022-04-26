package com.example.accountservice.repository;

import com.example.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AccountRepository extends CassandraRepository<Account,String> {
}
