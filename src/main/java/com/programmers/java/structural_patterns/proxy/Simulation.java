package com.programmers.java.structural_patterns.proxy;

import java.util.stream.IntStream;

public interface Simulation {
    void run();
    default void jump() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }
}
