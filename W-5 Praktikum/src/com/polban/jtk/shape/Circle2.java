package com.polban.jtk.shape;

public class Circle2 extends Shape {
    private double radius;

    // No-arg constructor
    public Circle2() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle2(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle2(double radius, String color, boolean filled) {
        super(color, filled); // Call the superclass (Shape) constructor
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method from Shape
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
