package com.aop.controller;

import com.aop.SpringConfiguration;
import com.aop.entity.Account;
import com.aop.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppController {

    // simulates the controller class
    public static void main(String[] args) {

        // read configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        AccountService accountService = context.getBean("accountService",
                AccountService.class);

        // call business method
        Account account = new Account();
        account.setId(1);
        account.setFirstName("Lucio");
        account.setLastName("Zhao");
        account.setEmail("lucio.zhao@email.com");

        // save account
        try {
            accountService.saveAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Account account2 = new Account();
        account.setId(12);
        account.setFirstName("John");
        account.setLastName("Cena");
        account.setEmail("john.cena@email.com");

        // save account
        try {
            accountService.saveAccount(account2);
            accountService.saveAccount(account2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // fetch accounts for AOP after save
        List<Account> accountList = accountService.getAccounts();

        // close
        context.close();

    }
}
