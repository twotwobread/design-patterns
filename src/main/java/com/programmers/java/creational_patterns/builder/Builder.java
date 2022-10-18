package com.programmers.java.creational_patterns.builder;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setGPS(boolean b);
}
