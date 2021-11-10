package com.Samsung;

import java.awt.*;

public abstract class Figure {

    public double xFigure;
    public double yFigure;
    public Color color;

    public abstract void move(double dx, double dy);

    public void setColor(Color color) {
        this.color = color;
    }


}
