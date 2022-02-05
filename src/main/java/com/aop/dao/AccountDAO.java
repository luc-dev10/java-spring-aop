package com.aop.dao;

import com.aop.entity.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> getAccounts();

    void saveAccount(Account account) throws Exception;

    Account getAccount(int id);

    void deleteAccount(Account account);

}
