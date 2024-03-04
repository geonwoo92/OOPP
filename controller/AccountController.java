package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        System.out.println("계좌번호 입력");
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(Account.builder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }


    public String cancelAccount(Scanner sc) {
        return accountService.cancelAccount(sc.next());
    }
}

