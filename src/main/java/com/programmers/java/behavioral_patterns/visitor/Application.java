package com.programmers.java.behavioral_patterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Visitor visitor = new JsonVisitor();
        City city = new City("053", "대구", 2366852);
        Industry industry = new Industry(1000, "정보통신", "이동통신, 신호처리");

        List<Node> nodes = Arrays.asList(city, industry);
        nodes.forEach(node -> node.accept(visitor));
    }
}
