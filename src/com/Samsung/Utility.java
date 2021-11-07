package com.Samsung;

public class Utility {
//вспомогатльный класс с набором методов, которые воращают длину одного из сторон треугольника
    public double utilityA(Point point1, Point point2, Point point3) {
        double catet_1_A = Math.abs(point1.xP - point2.xP);
        double catet_2_A = Math.abs(point1.yP - point2.yP);

        return Math.sqrt((catet_1_A * catet_1_A) + (catet_2_A * catet_2_A));
    }

    public double utilityB(Point point1, Point point2, Point point3) {
        double catet_1_b = Math.abs(point1.xP - point3.xP);
        double catet_2_b = Math.abs(point1.yP - point3.yP);

        return Math.sqrt((catet_1_b * catet_1_b) + (catet_2_b * catet_2_b));
    }

    public double utilityC(Point point1, Point point2, Point point3) {
        double catet_1_c = Math.abs(point2.xP - point3.xP);
        double catet_2_c = Math.abs(point2.yP - point3.yP);

        return Math.sqrt((catet_1_c * catet_1_c) + (catet_2_c * catet_2_c));
    }
}
