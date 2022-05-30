package com.keyin.testdrivendevelopment;


public class Circle {
    private double radius;
    public Circle() {
        this.radius = 0;

    }
    public Circle(double radArg) {
        this.radius = radArg;


    }

    public void setRadius(double radArg){
        this.radius = radArg;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return(radius * radius * Math.PI);
    }

}
