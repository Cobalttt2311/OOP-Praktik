package com.polban.jtk.shape;

public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with all attributes
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter for side
    public double getSide() {
        return getWidth();
    }

    // Setter for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setter for width and length to maintain square properties
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
