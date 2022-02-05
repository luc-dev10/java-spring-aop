package com.aop.dao;

import com.aop.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAOImpl implements AccountDAO {

    private final List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> getAccounts() {
        return this.accountList;
    }

    @Override
    public void saveAccount(Account account) throws Exception {

        // if exists, reminder
        if (this.accountList.contains(account))
            throw new Exception("This is bad business. User exists already.");

        this.accountList.add(account);
    }

    @Override
    public Account getAccount(int id) {

        for (Account account : this.accountList)
            if (account.getId() == id)
                return account;

        return null;
    }

    @Override
    public void deleteAccount(Account account) {
        this.accountList.remove(account);
    }
}
