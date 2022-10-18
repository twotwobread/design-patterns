package com.programmers.java.creational_patterns.prototype;

public class Circle extends Shape{
    private int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    Circle(Circle c) {
        super(c);
        radius = c.radius;
    }

    @Override
    public String toString() {
        return "Radius : " + radius;
    }

    @Override
    Shape cloning() {
        return new Circle(this);
    }
}
