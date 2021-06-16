package com.pwc.exceptionHandling;

public class AccountApp {

    public static void main(String[] args) {

        Account account = new Account(5000);

        try {
            float currentBalance = account.withdraw(5002);
            System.out.println("Withdraw was successful. The current balance is : " + currentBalance);
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }


        String stringValue = "25";

        try {
            int intValue = Integer.parseInt(stringValue);
            System.out.println(intValue);

        } catch (NumberFormatException ex) {
            System.out.println("stringValue : " + stringValue + " could not be converted to int");
        }


    }
}
