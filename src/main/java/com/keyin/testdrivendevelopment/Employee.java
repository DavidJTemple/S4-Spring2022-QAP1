package com.keyin.testdrivendevelopment;


public class Employee {

    private String firstName;
    private String lastName;

    public Employee () {
        this. firstName = "";
        this.lastName =  "";
    }
    public Employee(String firstArg, String lastArg) {
        this.firstName = firstArg;
        this.lastName = lastArg;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean returnTrue(boolean truthy) {
        return true;
    }
}
