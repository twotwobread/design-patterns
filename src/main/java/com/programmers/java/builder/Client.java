package com.programmers.java.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        // 어떤 종류의 차든 받을 수 있다.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        // 어떤 차의 매뉴얼인든 받을 수 있다.
        ManualBuilder builder2 = new ManualBuilder();
        director.constructSportsCar(builder2);
        Manual manual = builder2.getProduct();
    }
}
