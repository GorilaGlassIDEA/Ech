package com.Samsung;

import java.awt.*;

public class Triangle extends AllFigure {
    Point point1;
    Point point2;
    Point point3;


    public Triangle(Point v1, Point v2, Point v3) {
        point1 = v1;
        point2 = v2;
        point3 = v3;
    }

    public double getSurface() {
        double p = (utilityA(point1, point2, point3) + utilityB(point1, point2, point3) + utilityC(point1, point2, point3)) / 2;
        return Math.sqrt(p * (p - utilityA(point1, point2, point3)) * (p - utilityB(point1, point2, point3)) * (p - utilityC(point1, point2, point3)));
    }

    public double getPerimeter() {
        return utilityA(point1, point2, point3) + utilityB(point1, point2, point3) + utilityC(point1, point2, point3);
    }

    public boolean isIsoceles() {
        double a = Math.round(utilityA(point1, point2, point3));
        double b = Math.round(utilityB(point1, point2, point3));
        double c = Math.round(utilityC(point1, point2, point3));


        if (a == b) {
            return true;
        } else if (a == c) {
            return true;
        } else if (b == c) {
            return true;
        } else return false;
    }

    public boolean estEquilateral() {
        double a = Math.round(utilityA(point1, point2, point3));
        double b = Math.round(utilityB(point1, point2, point3));
        double c = Math.round(utilityC(point1, point2, point3));


        if ((a == b) && (b == c)) {
            return true;
        } else return false;
    }

    public boolean isRectangle() {
        double a = utilityA(point1, point2, point3);
        double b = utilityB(point1, point2, point3);
        double c = utilityC(point1, point2, point3);
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (a * a + b * b - c * c) / (2 * a * b);

        double angleA = Math.acos(cosA) * 180 / Math.PI;
        double angleB = Math.acos(cosB) * 180 / Math.PI;
        double angleC = Math.acos(cosC) * 180 / Math.PI;

        if ((angleA == 90) || (angleB == 90) || (angleC == 90)) {
            return true;
        } else return false;
    }


    @Override
    public String toString() {
        return "point 1: \n x:" + point1.xP + ", y:" + point1.yP +
                "\npoint 2: \n x:" + point2.xP + ", y:" + point2.yP +
                "\npoint 3: \n x:" + point3.xP + ", y:" + point3.yP +
                "\ngetSurface: " + getSurface() +
                "\ngetPerimeter: " + getPerimeter() +
                "\nisIsoceles: " + isIsoceles() +
                "\nestEquilateral: " + estEquilateral() +
                "\nisRectangle: " + isRectangle();
    }
}
