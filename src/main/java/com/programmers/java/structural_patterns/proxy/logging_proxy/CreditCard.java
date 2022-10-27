package com.programmers.java.structural_patterns.proxy.logging_proxy;

public class CreditCard implements Payment{

    Cash cash;
    public CreditCard(Cash cash) {
        this.cash = cash;
    }

    @Override
    public void pay(int amount) {
        System.out.println("카드 사용내역을 저장했습니다.");
        cash.pay(amount);
    }
}
