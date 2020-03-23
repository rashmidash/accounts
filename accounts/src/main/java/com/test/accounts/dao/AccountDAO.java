package com.test.accounts.dao;

import com.test.accounts.io.Account;
import com.test.accounts.io.Transactions;

import java.util.List;

/**
 * Created by 609092482 on 20/03/2020.
 */
public interface AccountDAO {

    List<Account> getAccounts(int customerid);
    List<Transactions> getTransactions(int accountnumber);
}
