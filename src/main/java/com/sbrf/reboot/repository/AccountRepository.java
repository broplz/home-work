package com.sbrf.reboot.repository;

import java.util.Set;

public interface AccountRepository {
    Set<Long> getAllAccountsByClientId(long clientId);
    Set<Long> getAllIdByContractNumber(long contractNumber);
    Set<Long> getAllByPhoneNumber(long phone);
}
