package com.programmers.java.structural_patterns.proxy.logging_proxy;

public class Cash implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println(amount + "원 지불했습니다.");
    }
}
