package com.jtk.polban;

public class Cylinder extends Shape{
    private double radius;
    private double heigth;

    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        heigth = h;
    }

    public double area(){
        return 2 * Math.PI * radius * (radius + heigth);
    }
}
