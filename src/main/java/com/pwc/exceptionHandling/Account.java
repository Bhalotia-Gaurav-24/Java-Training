package com.pwc.exceptionHandling;

public class Account {

        private float balance;
        private float creditLimit = 10000;

        public Account(float initialBalance) {
            this.balance = initialBalance;
        }


        public float withdraw(float amount) throws InsufficientBalanceException, CreditLimitReachedException {


            if (balance >= amount) {
                balance = balance - amount;


                /**
                 * We are checking whether the creditLimit has expired or not
                 */
                if (balance > ((-1f) * creditLimit)) {

                    throw new CreditLimitReachedException("Credit Limit Reached");

                }
                return balance;
            } else {
                throw new InsufficientBalanceException("The balance on hand is insufficient : " + this.balance);
            }


        }
}

