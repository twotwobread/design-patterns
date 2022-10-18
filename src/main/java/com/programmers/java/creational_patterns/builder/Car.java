package com.programmers.java.creational_patterns.builder;

public class Car {
    int seatNum;
    String engine;
    boolean haveGPS;

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setHaveGPS(boolean haveGPS) {
        this.haveGPS = haveGPS;
    }
}
