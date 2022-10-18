package com.programmers.java.prototype;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Shape (Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + " " + color;
    }



    abstract Shape cloning();
}
