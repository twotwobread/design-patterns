package com.programmers.java.factory_method;

public class Truck implements Transport{
    @Override
    public void go() {
        System.out.println("Truck타고 배송가요.");
    }
}
