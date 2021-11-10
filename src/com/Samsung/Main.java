package com.Samsung;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(0, 3);
        Point point2 = new Point(3, 5);
        Point point3 = new Point(0, 6);

        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle);
        triangle.move(1,2);
        System.out.println(triangle.point1.xP + " " +  triangle.point1.yP);
        // move - true

        soutFor();

        Rectangle rectangle = new Rectangle(point1, 1, 3);
        rectangle.move(1, 2);
        System.out.println(rectangle);

        soutFor();

        Square square = new Square(point1, 10);
        System.out.println(square);

        soutFor();

        Circle circle = new Circle(10,point1);
        System.out.println(circle);
    }

    static void soutFor() {
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
