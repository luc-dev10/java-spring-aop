package com.aop.dao;

import com.aop.entity.Account;

import java.util.List;

public interface AccountDAO {

    public List<Account> getAccounts();

    public void saveAccount(Account account);

    public Account getAccount(int id);

    public void deleteAccount(Account account);

}
