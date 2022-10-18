package com.programmers.java.singletone;

public class Database {

    private static final Database instance = new Database();

    private Database() {};
    public static Database getInstance() {
        return instance;
    }
    public void query(String str) {
        System.out.println("DB에 해당 쿼리를 날렸습니다.");
        System.out.println(str + "값이 DB에 저장되었습니다.");
    }
}
