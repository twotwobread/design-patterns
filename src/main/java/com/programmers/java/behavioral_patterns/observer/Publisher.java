package com.programmers.java.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    private Map<String, List<구독자>> 구독자들 = new HashMap<>();

    public Publisher(String... args) {
        for (String eventType : args) {
            구독자들.put(eventType, new ArrayList<>());
        }
    }

    public void 구독하기(String eventType, 구독자 subscriber) {
        구독자들.get(eventType).add(subscriber);
    }

    public void 구독취소하기(String eventType, 구독자 subscriber) {
        구독자들.get(eventType).remove(subscriber);
    }

    public void notify(String eventType, String 문자내용) {
        System.out.println();
        System.out.println(eventType + "를 구독한 구독자들에게 이를 알리기");
        List<구독자> 이벤트구독자들 = 구독자들.get(eventType);
        for (구독자 subscriber : 이벤트구독자들) {
            subscriber.update(문자내용);
        }
    }
}
