package com.Samsung;

public class Point extends Figure {

    double xP;
    double yP;

    Point(double x, double y) {
        xP = x;
        yP = y;
    }

    @Override
    public String toString() {
        return xP + " " + yP;
    }

    public double distanceTo(Point myPoint1, Point myPoint2) {
        double distanceX = Math.abs(myPoint1.xP - myPoint2.xP);
        double distanceY = Math.abs(myPoint1.yP - myPoint2.yP);

        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }

    public double distanceXTo(Point myPoint1, Point myPoint2) {
        return Math.abs(myPoint1.xP - myPoint2.xP);
    }

    public double distanceYTo(Point myPoint1, Point myPoint2) {
        return Math.abs(myPoint1.yP - myPoint2.yP);
    }

    @Override
    public void move(double dx, double dy) {
        xP+=dx;
        yP+=dy;
    }
}
