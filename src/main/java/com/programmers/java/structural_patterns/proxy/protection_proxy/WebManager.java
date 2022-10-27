package com.programmers.java.structural_patterns.proxy.protection_proxy;

public class WebManager implements Web{
    String authority;

    public WebManager(String authority) {
        this.authority = authority;
    }

    @Override
    public void showManagerInfo() {
        System.out.println("관리자들만 볼 수 있는 일급기밀 문서.");
    }
}
