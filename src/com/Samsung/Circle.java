package com.Samsung;

public class Circle extends AllFigure {

    public double radius;
    public Point center;

    Circle(double radius, Point center) {
        this.center = center;
        this.radius = radius;
    }

    public double getSurface(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*2;
    }
    public double getDiameter(){
        return radius*2;
    }
    public String toString(){
        return "point x: " + center.xP +
                "\npoint y: " + center.yP +
                "\ngetSurface: " + getSurface() +
                "\ngetPerimeter: " + getPerimeter() +
                "\ngetDiameter: " + getDiameter();
    }

}
