package com.programmers.java.factory_method;

public class Ship implements Transport{
    @Override
    public void go() {
        System.out.println("Ship타고 배송가요.");
    }
}
