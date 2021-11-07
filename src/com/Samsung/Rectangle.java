package com.Samsung;

public class Rectangle extends AllFigure {
    public Point point;
    public double edgeX;
    public double edgeY;

    Rectangle(Point point, double edgeX, double edgeY) {
        this.point = point;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    public double getSurface() {
        return edgeX * edgeY;
    }

    public double getPerimeter() {
        return edgeX * 2 + edgeY * 2;
    }

    public String toString() {
        return "point x: " + point.xP + "\npoint y:" + point.yP +
                "\ngetSurface: " + getSurface() +
                "\ngetPerimeter: " + getPerimeter();
    }
}

