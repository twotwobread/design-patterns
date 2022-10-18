package com.programmers.java.creational_patterns.singletone;

public class Application {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.query("쿼리 날리기");
    }
}
