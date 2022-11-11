package com.programmers.java.behavioral_patterns.observer;

public class 지인에게알리는구독자 implements 구독자{

    private final String 지인;

    public 지인에게알리는구독자(String 지인) {
        this.지인 = 지인;
    }

    @Override
    public void update(String 문자내용) {
        System.out.println();
        System.out.println(문자내용 + "라는 문자를 받고 " + 지인 + "에게 소식을 알린다.");
    }
}
