package com.aop.service;

import com.aop.dao.AccountDAO;
import com.aop.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    // dependency injection for DAO
    @Autowired
    private AccountDAO accountDAO;

    @Override
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }

    @Override
    public void saveAccount(Account account) {
        accountDAO.saveAccount(account);
    }

    @Override
    public Account getAccount(int id) {
        return accountDAO.getAccount(id);
    }

    @Override
    public void deleteAccount(Account account) {
        accountDAO.deleteAccount(account);
    }

    // service extra
    @Override
    public boolean isServiceRunning() {
        return true;
    }
}
