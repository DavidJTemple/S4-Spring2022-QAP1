package com.keyin.testdrivendevelopment;


public class Circle {
    private double radius;
    public Circle() {
        this.radius = 0;

    }
    public Circle(double radArg) {
        this.radius = radArg;


    }

    public double getArea(){
        return(radius * radius * Math.PI);
    }

}
