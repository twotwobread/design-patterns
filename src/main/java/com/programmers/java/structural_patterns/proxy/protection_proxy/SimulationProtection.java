package com.programmers.java.structural_patterns.proxy.protection_proxy;

import com.programmers.java.structural_patterns.proxy.Simulation;

public class SimulationProtection implements Simulation {
    @Override
    public void run() {
        Web web;

        System.out.println("********** 진짜 객체를 통해서 일반인이 매니저 정보로 접근 ***********");
        web = new WebManager("일반인");
        web.showManagerInfo();

        System.out.println("********** 진짜 객체를 통해서 매니저가 매니저 정보로 접근 ***********");
        web = new WebManager("manager");
        web.showManagerInfo();

        System.out.println();

        System.out.println("********** 보호 프록시를 통해서 일반인이 매니저 정보로 접근 ***********");
        web = new WebLogin("일반인");
        web.showManagerInfo();

        System.out.println("********** 보호 프록시를 통해서 매니저가 매니저 정보로 접근 ***********");
        web = new WebLogin("manager");
        web.showManagerInfo();
    }
}
