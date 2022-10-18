package com.programmers.java.creational_patterns.builder;

public class ManualBuilder implements Builder{
    private Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeatNum(number);
        System.out.println("해당 차량은 " + number + "개의 " + "좌석으로 이루어져있습니다.");
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
        System.out.println("해당 차량의 엔진부는 " + engine + "라는 엔진으로 구성됩니다.");
    }

    @Override
    public void setGPS(boolean b) {
        manual.setHaveGPS(b);
        if (manual.haveGPS) {
            System.out.println("해당 차량은 GPS 장치가 장착됩니다.");
        } else {
            System.out.println("해당 차량은 GPS 장치가 장착되지 않습니다.");
        }
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
