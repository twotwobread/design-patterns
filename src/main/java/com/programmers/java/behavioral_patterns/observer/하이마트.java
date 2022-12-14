package com.programmers.java.behavioral_patterns.observer;

public class 하이마트 {
    Publisher publisher; // 구독 메커니즘을 담당하는 클래스

    public 하이마트() {
        publisher = new Publisher("맥북", "갤럭시");
    }

    public void 맥북재고확보() {
        System.out.println("하이마트에 맥북 재고가 확보되었음.");
        publisher.notify("맥북", "맥북 재고 들어왔습니다.");
    }

    public void 갤럭시노트북재고확보() {
        System.out.println("하이마트에 갤럭시 노트북 재고가 확보되었음.");
        publisher.notify("갤럭시", "갤럭시노트북 재고 들어왔습니다.");
    }
}
