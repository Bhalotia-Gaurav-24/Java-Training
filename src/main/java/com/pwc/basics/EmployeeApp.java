package com.pwc.basics;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee.setTotalEmployee(284000);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.setId(101);
        emp1.setName("Gaurav");
        emp1.setAddress("Delhi");

        emp2.setId(102);
        emp2.setName("Aman");
        emp2.setAddress("Bangalore");

        emp3.setId(103);
        emp3.setName("Arun");
        emp3.setAddress("Mumbai");

        emp4.setId(104);
        emp4.setName("Mayank");
        emp4.setAddress("Hydrabad");

        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();

        emp3.printEmployeeDetails();
        emp4.printEmployeeDetails();

        Employee emp5= new Employee(105,"Manish","Chennai");
        emp5.printEmployeeDetails();

        System.out.println(emp3.getId() + " -- " +emp3.getName() + " -- " + emp3.getAddress());
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);


        Employee emp6 = new Employee(106, "Deepak", "Gurugram");
        System.out.println(emp1.equals(emp6));
        if(emp1.equals(emp6))
        {
            throw new RuntimeException("The two employees cannot have same id's. ");
        }
        else{
            System.out.println("Validation succeeded");
        }

    }

}
