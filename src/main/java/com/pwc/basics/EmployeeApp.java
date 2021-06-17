package com.pwc.basics;

import com.pwc.trainings.assignment.Supplier;

public class EmployeeApp {

    public static void main(String[] args) {


        /**
         * Integer.valueOf
         *
         * to see the op-code of the bytecode
         * javap -c << name of the class >>
         */
        Integer age = 25;

        int intValue = age.intValue();


        Supplier supplier = new Supplier();
        // following cannot be accessed directly as displayName is
        // protected in assignment1 package
//        supplier.displayName();


        Employee.setTotalEmployees(284000);

        Employee emp1 = new Employee();

        emp1.setId(101);

        emp1.setName("Shakir");
        emp1.setAddress("baroda");
        emp1.printEmployeeDetails();

        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("Shazia");
        emp2.setAddress("baroda");

        emp2.printEmployeeDetails();

        Employee emp3 = new Employee(103, "Murali", "Chennai");
        emp3.printEmployeeDetails();


        System.out.println(emp3.getId() + " -- " + emp3.getAddress());


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);


        Employee emp4 = new Employee(104, "Deepak", "Mumbai");
//        System.out.println(emp1.equals(emp4));
        if (emp1.equals(emp4)) {
            throw new RuntimeException("The two employees cannot have same id");
        } else {
            System.out.println("Validation succeeded");
        }


    }
}