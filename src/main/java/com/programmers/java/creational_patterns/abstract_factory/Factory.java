package com.programmers.java.creational_patterns.abstract_factory;

public interface Factory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
