package com.sbrf.reboot.service;

import com.sbrf.reboot.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AccountServiceTest {

    @Mock
    AccountRepository accountRepository;

    AccountService accountService;

    @BeforeEach
    void setUp() {
        accountRepository = Mockito.mock(AccountRepository.class);

        accountService = new AccountService(accountRepository);
    }

    @Test
    void contractExist() {
        Set<Long> accounts = new HashSet();
        accounts.add(111L);

        long clientId = 1L;
        long contractNumber = 111L;


        when(accountRepository.getAllAccountsByClientId(clientId)).thenReturn(accounts);

        assertTrue(accountService.isClientHasContract(clientId, contractNumber));
    }

    @Test
    void idExist() {
        Set<Long> accounts = new HashSet();
        accounts.add(1L);

        long clientId = 1L;
        long contractNumber = 111L;


        when(accountRepository.getAllIdByContractNumber(contractNumber)).thenReturn(accounts);

        assertTrue(accountService.findClientIdByContractNumber(clientId, contractNumber));
    }

    @Test
    void idExistByPhoneNumber() {
        Set<Long> accounts = new HashSet();
        accounts.add(1L);

        long clientId = 1L;
        long phoneNumber = 111111111L;


        when(accountRepository.getAllIdByContractNumber(phoneNumber)).thenReturn(accounts);

        assertTrue(accountService.findClientIdByPhoneNumber(clientId, phoneNumber));
    }

    @Test
    void idNotExistByPhoneNumber() {
        Set<Long> accounts = new HashSet();
        accounts.add(1123123L);

        long clientId = 1L;
        long phoneNumber = 111111111L;


        when(accountRepository.getAllIdByContractNumber(phoneNumber)).thenReturn(accounts);

        assertFalse(accountService.findClientIdByPhoneNumber(clientId, phoneNumber));
    }

    @Test
    void idNotExist() {
        Set<Long> accounts = new HashSet();
        accounts.add(222L);

        long clientId = 1L;
        long contractNumber = 111L;

        when(accountRepository.getAllIdByContractNumber(contractNumber)).thenReturn(accounts);

        assertFalse(accountService.findClientIdByContractNumber(clientId, contractNumber));
    }

    @Test
    void contractNotExist() {
        Set<Long> accounts = new HashSet();
        accounts.add(222L);

        long clientId = 1L;
        long contractNumber = 111L;

        when(accountRepository.getAllAccountsByClientId(clientId)).thenReturn(accounts);

        assertFalse(accountService.isClientHasContract(clientId, contractNumber));
    }

    @Test
    void repositoryHasTreeMethods() {
        assertEquals(3, AccountRepository.class.getMethods().length);
    }

    @Test
    void serviceHasTreeMethods() {
        assertEquals(3, AccountService.class.getMethods().length - Object.class.getMethods().length);
    }

}