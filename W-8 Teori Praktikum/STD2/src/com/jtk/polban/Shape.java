package com.jtk.polban;
public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public abstract double area(); // Method abstract untuk menghitung area

    @Override
    public String toString() {
        return shapeName;
    }
}

