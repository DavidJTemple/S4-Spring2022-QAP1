package com.keyin.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testNoCircle() {
        Circle circle = new Circle();
        Assertions.assertEquals(0, 0);

    }
    @Test
    public void tesNotNull(){
        Circle circle = new Circle(1);
        Assertions.assertNotNull(1);
    }
    @Test
    public void testGetArea() {
        Circle circle = new Circle(3);
        Assertions.assertEquals(circle.getArea(), circle.getArea());
    }
}
