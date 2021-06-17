package com.pwc.exceptionHandling;

public class AccountApp {

    public static void main(String[] args) {

        Account account = new Account(5000);

//
//        if (account.withdraw(5001) == 0) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failed....");
//        }
//        try {
//            float currentBalance = account.withdraw(5002);
//            System.out.println("Withdraw was successful. The current balance is : " + currentBalance);
//        } catch (InsufficientBalanceException ex) {
//            System.out.println(ex.getMessage());
//        } catch (CreditLimitReachedException ex) {
//            System.out.println(ex.getMessage());
//        }


        try {
            float currentBalance = account.withdraw(5002);
            System.out.println("Withdraw was successful. The current balance is : " + currentBalance);


        } catch (InsufficientBalanceException | CreditLimitReachedException ex) {
            System.out.println(ex.getMessage());
            // Extremely important for debugging
            ex.printStackTrace();

            // finally will always execute - whether there was an exception or not
        } finally {

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
