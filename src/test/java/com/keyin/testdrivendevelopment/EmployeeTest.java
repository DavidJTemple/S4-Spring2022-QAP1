package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testNoEmployeeName(){
        Employee employee = new Employee();
        Assertions.assertEquals(employee.getFirstName(), "");

        employee.setFirstName("John");
        Assertions.assertEquals("John", employee.getFirstName());

    }
    @Test
    public void testEmployeeFirstName(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertEquals("David", employee.getFirstName());
        Assertions.assertNotEquals("Reggie", employee.getFirstName());
    }
    @Test
    public void testEmployeeNames(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertNotNull("Temple", employee.getLastName());
        Assertions.assertNotEquals("Johnson", employee.getLastName());
    }
    @Test
    public void testEmployeeBoolean(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertTrue(employee.returnTrue());
    }
}
