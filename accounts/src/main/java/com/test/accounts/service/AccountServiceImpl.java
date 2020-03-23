package com.test.accounts.service;

import com.test.accounts.io.Account;
import com.test.accounts.io.Transactions;
import com.test.accounts.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 609092482 on 20/03/2020.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public List<Account> getListOfAccount(int customerid) {
        return accountDAO.getAccounts(customerid);
    }

    @Override
    public List<Transactions> getTransactions(int accountNumber)
    {
        return accountDAO.getTransactions(accountNumber);
    }
}
