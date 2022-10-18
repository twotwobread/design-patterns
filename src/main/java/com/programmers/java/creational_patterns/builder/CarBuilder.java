package com.programmers.java.creational_patterns.builder;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeatNum(number);
        System.out.println(car.seatNum + "개의 좌석을 장착합니다.");
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
        System.out.println(car.engine + "라는 엔진을 장착합니다.");
    }

    public void setGPS(boolean b) {
        car.setHaveGPS(b);
        if (car.haveGPS)
            System.out.println("GPS를 장착합니다.");
        else
            System.out.println("GPS를 장착하지 않습니다.");
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return car;
    }
}
