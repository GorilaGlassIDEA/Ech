package com.Samsung;

public class Square extends Rectangle {


    public Square(Point point, double edgeX) {
        super(point, edgeX);
        this.point = point;
    }

    public double getSurface() {
        return edgeX * edgeX;
    }
    public double getPerimeter(){
        return edgeX*4;
    }

    public String toString() {
        return "point x: " + point.xP +
                "\npoint y: " + point.yP +
                "\ngetSurface: " + getSurface() +
                "\ngetPerimeter: " + getPerimeter();

    }

}
