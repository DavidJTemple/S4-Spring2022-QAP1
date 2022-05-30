package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testNoRadius() {
        Circle circle = new Circle();
        Assertions.assertEquals(0, 0);

        circle.setRadius(23.5);
        Assertions.assertNotEquals(13, circle.getRadius());

    }
    @Test
    public void tesNotNull(){
        Circle circle = new Circle(1);
        Assertions.assertNotNull(circle.getRadius());
        Assertions.assertNotEquals(2, circle.getRadius());
    }
    @Test
    public void testGetArea() {
        Circle circle = new Circle(3);
        Assertions.assertEquals(circle.getArea(), circle.getArea());
        Assertions.assertNotEquals(10, circle.getRadius());
    }
}
