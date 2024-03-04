package view;


import controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {

        AccountController accountController = new AccountController();

        while (true) {
            System.out.println("[Account] 0-Exit\n " +
                    "1-Create \n " +
                    "2-Deposit" +
                    "3-WithDraw\n " +
                    "4-Balance\n " +
                    "5-RemoveAccount\n " +
                    "6-List(account)");

            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("Create Accounte");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println("Deposit");
                    System.out.println(accountController.deposit(sc));
                break;
                case "3":
                    System.out.println("Withdraw");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("Balance");

                case"5":
                    System.out.println("Cancel Accounte");
                    System.out.println(accountController.cancelAccount(sc));
                        break;
                case"6":
                    System.out.println("List(Account)");
                    System.out.println(accountController);
            }


        }
    }
}


