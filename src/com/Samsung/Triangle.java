package com.Samsung;

public class Triangle extends Figure {
    Point point1;
    Point point2;
    Point point3;


    public Triangle(Point v1, Point v2, Point v3) {
        point1 = v1;
        point2 = v2;
        point3 = v3;
    }

    public double utilityA() {
        double catet_1_A = Math.abs(point1.xP - point2.xP);
        double catet_2_A = Math.abs(point1.yP - point2.yP);

        return Math.sqrt((catet_1_A * catet_1_A) + (catet_2_A * catet_2_A));
    }

    public double utilityB() {
        double catet_1_b = Math.abs(point1.xP - point3.xP);
        double catet_2_b = Math.abs(point1.yP - point3.yP);

        return Math.sqrt((catet_1_b * catet_1_b) + (catet_2_b * catet_2_b));
    }

    public double utilityC() {
        double catet_1_c = Math.abs(point2.xP - point3.xP);
        double catet_2_c = Math.abs(point2.yP - point3.yP);

        return Math.sqrt((catet_1_c * catet_1_c) + (catet_2_c * catet_2_c));
    }


    public double getSurface() {
        double p = (utilityA() + utilityB() + utilityC()) / 2;
        return Math.sqrt(p * (p - utilityA()) * (p - utilityB()) * (p - utilityC()));
    }

    public double getPerimeter() {
        return utilityA() + utilityB() + utilityC();
    }

    public boolean isIsoceles() {
        double a = Math.round(utilityA());
        double b = Math.round(utilityB());
        double c = Math.round(utilityC());


        if (a == b) {
            return true;
        } else if (a == c) {
            return true;
        } else return b == c;
    }

    public boolean estEquilateral() {
        double a = Math.round(utilityA());
        double b = Math.round(utilityB());
        double c = Math.round(utilityC());


        return (a == b) && (b == c);
    }

    public boolean isRectangle() {
        double a = utilityA();
        double b = utilityB();
        double c = utilityC();
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (a * a + b * b - c * c) / (2 * a * b);

        double angleA = Math.acos(cosA) * 180 / Math.PI;
        double angleB = Math.acos(cosB) * 180 / Math.PI;
        double angleC = Math.acos(cosC) * 180 / Math.PI;

        return (angleA == 90) || (angleB == 90) || (angleC == 90);
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
    @Override
    public void move(double dx, double dy) {
        point1.xP +=dx;
        point2.xP +=dx;
        point3.xP +=dx;

        point1.yP +=dy;
        point2.yP +=dy;
        point3.yP +=dy;

    }
}
