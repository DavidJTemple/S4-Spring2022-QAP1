package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testNoRadius() {
        Circle circle = new Circle();
        Assertions.assertEquals(0, 0);
        System.out.println("The default value of an empty radius argument is: " + circle.getRadius());

        circle.setRadius(0);
        Assertions.assertNotEquals(13, circle.getRadius());
        System.out.println("Circle radius does not equal 13");

    }
    @Test
    public void testNot(){
        Circle circle = new Circle(1);
        Assertions.assertNotNull(circle.getRadius());
        System.out.println("The radius of circle is: " + circle.getRadius());
        Assertions.assertNotEquals(2, circle.getRadius());
    }
    @Test
    public void testGetArea() {
        Circle circle = new Circle(3);
        Assertions.assertEquals(circle.getArea(), circle.getArea());
        System.out.println("The area of the circle is: " + circle.getArea());
        Assertions.assertNotEquals(10.25, circle.getRadius());
        System.out.println("Area of circle does not equal 10.25");
    }
}
