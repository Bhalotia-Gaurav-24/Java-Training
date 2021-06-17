package com.pwc.basics;



/**
 * The name of the class must start with UpperCase
 * The name of class must and must be Nouns
 * The name of variables and methods must always start with lower case unless the variable is a FINAL
 * The methods must always be verbs
 */
public class Employee {


    /**
     * Encapsulating the state of the object. And provide setters & getters in order to
     * allow access to the state from out of the class
     */
    public int id;
    private String name;
    private String address;
    private static int totalEmployees;

    /**
     * static block
     */
    static {

        totalEmployees = 1000;
        System.out.println("This will execute once and for all : when the class is loaded");
    }


    public Employee() {

    }

    public Employee(int id) {
        this.id = id;
    }


    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }


    public static void setTotalEmployees(int totalEmps) {

        totalEmployees = totalEmps;

        // you cannot refer to instance variables from the static method
//        System.out.println(this.id);

    }

    public void printEmployeeDetails() {


        System.out.println("Id : " + this.id + " Name : " + this.name + " Address :" + this.address);

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id < 1) {
            throw new RuntimeException("id must be greater than 0");
        }
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString() {

//        return "Yabadabaadoo";
        return this.id + " -- " + this.name + " -- " + this.address + " -- " + totalEmployees;

    }

    public boolean equals(Employee obj) {

        return this.id == obj.id;

    }
}

