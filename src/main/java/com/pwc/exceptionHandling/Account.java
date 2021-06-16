package com.pwc.exceptionHandling;

public class Account {

    private float balance;

    public Account(float initialBalance) {
        this.balance = initialBalance;
    }


    public float withdraw(float amount) throws InsufficientBalanceException {

        if (balance >= amount) {
            balance = balance - amount;
            return balance;
        } else {
            throw new InsufficientBalanceException("The balance on hand is insufficient : " + this.balance);
        }

    }

}
