package com.company;
class Cylinder {
    private int radius;
    private int height;
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int Radius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int Height() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double Volume() {
        return (Math.PI*radius*radius*height);
    }

    public double SurfaceArea() {
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
}
public class getter_setter {

    public static void main(String[] args) {

        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.Height());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.Radius());
        // Problem 2
        System.out.println(myCylinder.SurfaceArea());
        System.out.println(myCylinder.Volume());
    }
}
