package com.programmers.java.behavioral_patterns.observer;

public class 차타고가는구독자 implements 구독자{
    // 알림을 받았을 때, 어떤 행동을 취하기 위해 필요한 필드들.
    private final String 차종;

    public 차타고가는구독자(String 차종) {
        this.차종 = 차종;
    }

    @Override
    public void update(String 문자내용) {
        System.out.println();
        System.out.println(문자내용 + "라는 문자를 받고 " + 차종 + "를 타고 하이마트로 달려간다.");
    }
}
