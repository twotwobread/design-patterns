package com.programmers.java.prototype;

public class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    Rectangle(Rectangle r) {
        super(r);
        width = r.width;
        height = r.height;
    }

    @Override
    public String toString() {
        return "Width : " + width + ", Height : " + height;
    }

    @Override
    Shape cloning() {
        return new Rectangle(this);
    }
}
