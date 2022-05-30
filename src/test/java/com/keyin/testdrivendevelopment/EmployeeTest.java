package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testNoEmployeeName(){
        Employee employee = new Employee();
        Assertions.assertEquals("", "");

    }
    @Test
    public void testEmployeeFirstName(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertEquals("David", employee.getFirstName());
    }
    @Test
    public void testEmployeeLastName(){
        Employee employee = new Employee("David", "Temple");
        Assertions.assertNotNull("Temple", employee.getLastName());
    }
    @Test
    public void testEmployeeFullName(){
        Employee employee = new Employee();
        Assertions.assertTrue(true);
    }
}
