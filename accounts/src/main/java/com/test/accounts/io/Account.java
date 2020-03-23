package com.test.accounts.io;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by 609092482 on 20/03/2020.
 */
public class Account{

    private int accountNumber;
    private String accountName;
    private String currency;
    private String accountType;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date balanceDate;
    private int openingBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public int getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(int openingBalance) {
        this.openingBalance = openingBalance;
    }
}
