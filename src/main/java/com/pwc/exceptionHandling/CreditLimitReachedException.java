package com.pwc.exceptionHandling;

public class CreditLimitReachedException extends Exception {

    public CreditLimitReachedException(String message) {
        super(message);

    }
}
