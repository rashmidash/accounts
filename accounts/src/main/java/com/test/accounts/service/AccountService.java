package com.test.accounts.service;

import com.test.accounts.io.Account;
import com.test.accounts.io.Transactions;

import java.util.List;

/**
 * Created by 609092482 on 20/03/2020.
 */
public interface AccountService {
    List<Account> getListOfAccount(int customerId);
    List<Transactions> getTransactions(int accountNumber);
}
