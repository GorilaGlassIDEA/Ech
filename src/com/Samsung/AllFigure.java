package com.Samsung;

import java.awt.*;

public class AllFigure extends Utility {

    public double xFigure;
    public double yFigure;
    private Color color;

    public void move(double dx, double dy) {
        xFigure += dx;
        yFigure += dy;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
