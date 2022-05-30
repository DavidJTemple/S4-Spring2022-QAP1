package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testNoEmployeeName(){
        Employee employee = new Employee();
        Assertions.assertEquals(employee.getFirstName(), "");
        System.out.println("Employee has no names created yet");

        employee.setFirstName("John");
        Assertions.assertEquals("John", employee.getFirstName());
        System.out.println("Employees first name is: " + employee.getFirstName());

    }
    @Test
    public void testEmployeeFirstName(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertEquals("David", employee.getFirstName());
        System.out.println("Employees first name: " + employee.getFirstName());
        Assertions.assertNotEquals("Reggie", employee.getFirstName());
        System.out.println("Employees first name is not Reggie");
    }
    @Test
    public void testEmployeeNames(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertNotNull("Temple", employee.getLastName());
        System.out.println("Employees last name is: " + employee.getLastName() + "and is NOT a null value");
        Assertions.assertNotEquals("Johnson", employee.getLastName());
        System.out.println("The employees last name is not Johnson");
    }
    @Test
    public void testEmployeeBoolean(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertTrue(employee.returnTrue());
        System.out.println(employee.getFirstName() + " " + employee.getLastName()+ " has returned a boolean value of "
                +employee.returnTrue());
    }
}
