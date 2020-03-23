package com.test.accounts.com.test.accounts.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.accounts.io.Account;
import com.test.accounts.io.Transactions;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by 609092482 on 20/03/2020.
 */
@Service
public class FileUtils{
    public static List<Account> readAccountJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Account> accounts = objectMapper.readValue(new File("C:\\DATA\\explore\\accounts\\src\\main\\resources\\accounts.json"), List.class);
        return accounts;
    }

    public static List<Transactions> readTransactionsJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Transactions> transactions = objectMapper.readValue(new File("C:\\DATA\\explore\\accounts\\src\\main\\resources\\transactions.json"), List.class);
        return transactions;
    }

}
