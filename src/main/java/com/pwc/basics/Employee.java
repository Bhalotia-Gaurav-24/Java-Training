package com.pwc.basics;

public class Employee {
    private int id;
    private String name;
    private String address;
    private static int totalEmployee ;

    static{
        totalEmployee= 284258;
        System.out.println("This will executed once and for all: When the class is loaded");
    }

    public static void setTotalEmployee(int totalEmployee) {
        totalEmployee = totalEmployee;
    }

    public Employee()
    {

    }

    public Employee(int id)
    {
        this.id=id;
    }

    public Employee(int id, String name, String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        //return String.valueOf(this.id);

        return this.id + " -- " + this.name + " -- " + this.address + " -- " + totalEmployee;
    }

    public void printEmployeeDetails() {
        System.out.println("id :" + this.id + " Name :" + this.name +" address :" +this.address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Employee obj)
    {
        return this.id == obj.id;

    }
}
