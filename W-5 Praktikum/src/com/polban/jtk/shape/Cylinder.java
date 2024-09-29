package com.polban.jtk.shape;

/**
 * The Cylinder class extends the Circle class and models a cylinder
 * with a height, in addition to radius and color inherited from Circle.
 */
public class Cylinder extends Circle {
    // Private instance variable for height
    private double height;

    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // Call superclass no-arg constructor (Circle())
        height = 1.0;
    }

    // Constructor with default radius and color, but given height
    public Cylinder(double height) {
        super(3.0); // Call superclass no-arg constructor (Circle())
        this.height = height;
    }

    // Constructor with default color, but given radius and height
    public Cylinder(double radius, double height) {
        super(radius,"Blue"); // Call superclass constructor Circle(radius)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of the cylinder
    // Use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * height * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height; // Combine Circle's toString() with height
    }
}

