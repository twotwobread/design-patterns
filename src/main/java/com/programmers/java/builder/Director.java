package com.programmers.java.builder;

public class Director {
    void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("완전 빠른 스포츠 엔진");
        builder.setGPS(true);
    }

    void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("평범하지만 안정성있는 SUV 엔진");
        builder.setGPS(false);
    }
}
