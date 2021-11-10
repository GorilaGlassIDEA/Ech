package com.Samsung;

public class Rectangle extends Figure {
    public Point point;
    public double edgeX;
    public double edgeY;

    public Rectangle(Point point, double edgeX, double edgeY) {
        this.point = point;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    public Rectangle(Point point, double edgeX) {
        this.point = point;
        this.edgeX = edgeX;
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

    @Override
    public void move(double dx, double dy) {
        point.xP +=dx;
        point.yP +=dy;
    }
}

