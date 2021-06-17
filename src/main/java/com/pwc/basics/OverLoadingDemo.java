package com.pwc.basics;

public class OverLoadingDemo {

    public void printEmployeeDetails() {

        printEmployeeDetails(false);
    }

    public void printEmployeeDetails(boolean printDepartDetails) {

        /**
         * logic of printing name, surname, address
         */

        if (printDepartDetails) {
            /**
             * logic of printing the departments....
             */
        }
    }


    public static void main(String[] args) {

        OverLoadingDemo overLoadingDemo = new OverLoadingDemo();

        overLoadingDemo.printEmployeeDetails();
        overLoadingDemo.printEmployeeDetails(true);


    }

}