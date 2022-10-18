package com.programmers.java.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static List<Shape> list = new ArrayList<>();

    Application() {
        Circle circle = new Circle(10, 10, 20);
        list.add(circle);

        Circle anotherCircle = (Circle) circle.cloning();
        list.add(anotherCircle);

        Rectangle rectangle = new Rectangle(10, 10, 10, 20);
        list.add(rectangle);
    }
    public static void main(String[] args) {
        Application app = new Application();

        List<Shape> listCopy = new ArrayList<>();

        for (Shape shape : list) {
            listCopy.add(shape.cloning());
        }

        for (int i = 0; i < list.size(); i++) {
            listCopy.get(i).setColor("Green");
            System.out.println(list.get(i) + " | " + listCopy.get(i));
            System.out.println(list.get(i).getClass() + " | " + listCopy.get(i).getClass());
        }
    }
}
