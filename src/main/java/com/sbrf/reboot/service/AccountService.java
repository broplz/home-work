package com.sbrf.reboot.service;

import lombok.NonNull;
import lombok.val;


import com.sbrf.reboot.repository.AccountRepository;

public class AccountService {
    AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isClientHasContract(@NonNull long clientId, long contractNumber) {
        return accountRepository.getAllAccountsByClientId(clientId).contains(contractNumber);
    }

    public boolean findClientIdByContractNumber(long clientId, @NonNull long contractNumber) {
        return accountRepository.getAllIdByContractNumber(contractNumber).contains(clientId);
    }

    public boolean findClientIdByPhoneNumber(long clientId, long phoneNumber) {
        return accountRepository.getAllByPhoneNumber(phoneNumber).contains(clientId);
    }
}