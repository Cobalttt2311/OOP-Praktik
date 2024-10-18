package com.jtk.polban;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }
}
