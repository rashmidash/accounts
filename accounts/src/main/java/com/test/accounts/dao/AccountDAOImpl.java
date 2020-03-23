package com.test.accounts.dao;

import com.test.accounts.com.test.accounts.util.FileUtils;
import com.test.accounts.io.Account;
import com.test.accounts.io.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 609092482 on 20/03/2020.
 */
@Service
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    FileUtils fileUtils;

    @Override
    public List<Account> getAccounts(int customerid) {
        List<Account> accounts = new ArrayList<>();
        try {
            accounts = FileUtils.readAccountJsonWithObjectMapper();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public List<Transactions> getTransactions(int accountnumber) {
        List<Transactions> transactions = new ArrayList<>();
        try {
            transactions = FileUtils.readTransactionsJsonWithObjectMapper();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }
}
