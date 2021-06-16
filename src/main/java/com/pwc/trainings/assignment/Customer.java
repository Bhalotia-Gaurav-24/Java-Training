package com.pwc.trainings.assignment;

public abstract class Customer {

    private int id;
    private String name;

    public void printDetails()
    {
        System.out.println("Customer details will be printed");
    }
    public abstract void createinvoice();
}
