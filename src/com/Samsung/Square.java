package com.Samsung;

public class Square extends AllFigure {

    public Point point;
    double edge;

    Square(Point point, double edge) {
        this.point = point;
        this.edge = edge;
    }

    public double getSurface() {
        return edge * edge;
    }
    public double getPrimeter(){
        return edge*4;
    }

    public String toString() {
        return "point x: " + point.xP +
                "\npoint y: " + point.yP +
                "\ngetSurface: " + getSurface() +
                "\ngetPerimeter: " + getPrimeter();

    }

}
