package com.programmers.java.behavioral_patterns.observer;

public class 손님 {
    public static void main(String[] args) {
        하이마트 himart = new 하이마트();

        //하이마트에 특정 이벤트에 구독을 한 손님.
        himart.subject.구독하기("맥북", new 차타고가는구독자("소나타"));
        himart.subject.구독하기("갤럭시", new 지인에게알리는구독자("뚜영이"));

        System.out.println("1. 맥북 이벤트 발생");
        himart.맥북재고확보();

        System.out.println("\n#######################################\n");

        System.out.println("2. 갤럭시 노트북 이벤트 발생");
        himart.갤럭시노트북재고확보();
    }
}
