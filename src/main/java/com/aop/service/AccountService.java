package com.aop.service;

import com.aop.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();

    void saveAccount(Account account) throws Exception;

    Account getAccount(int id);

    void deleteAccount(Account account);

    boolean isServiceRunning();

}
