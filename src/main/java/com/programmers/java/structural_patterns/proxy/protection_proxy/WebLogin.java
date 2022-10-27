package com.programmers.java.structural_patterns.proxy.protection_proxy;

public class WebLogin implements Web{
    private String authority;
    private WebManager webManager;

    public WebLogin(String authority) {
        this.authority = authority;
        webManager = new WebManager(authority);
    }

    @Override
    public void showManagerInfo() {
        if (authority.equals("manager")) {
            System.out.println("관리자 권한이 확인되었습니다.");
            webManager.showManagerInfo();
        } else {
            System.out.println("접근 권한이 없습니다.");
        }
    }
}
