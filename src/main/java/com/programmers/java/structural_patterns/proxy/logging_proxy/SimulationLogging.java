package com.programmers.java.structural_patterns.proxy.logging_proxy;

import com.programmers.java.structural_patterns.proxy.Simulation;

public class SimulationLogging implements Simulation {

    @Override
    public void run() {
        Payment payment;
        System.out.println("********** 진짜 객체인 현금에 직접 접근해서 pay를 실행하는 상황 ***********");
        payment = new Cash();
        payment.pay(1000);

        System.out.println();

        System.out.println("********** 프록시 패턴을 적용해서 로깅 프록시를 이용해서 pay를 실행하는 상황 ***********");
        payment = new CreditCard(new Cash());
        payment.pay(1000);
    }
}
