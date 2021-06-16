package com.pwc.trainings.assignment;

public class SalesApp {
    public static void main(String args[]) {
       // Customer obj1 = new Customer();
//        LocalCustomer localCustomer= new LocalCustomer();
//        localCustomer.printDetails();
//        localCustomer.createinvoice();
//        //System.out.println(obj1);
        Customer aCustomer= new LocalCustomer();
        aCustomer.createinvoice();

        printCustomerDetails(aCustomer);

    }

    public static void printCustomerDetails(Customer customer) {
        customer.printDetails();
    }
}
