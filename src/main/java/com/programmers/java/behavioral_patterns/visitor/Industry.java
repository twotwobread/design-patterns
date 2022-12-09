package com.programmers.java.behavioral_patterns.visitor;

public class Industry implements Node{

    private final int id;
    private final String name;
    private final String subjects;

    public Industry(int id, String name, String subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIndustry(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubjects() {
        return subjects;
    }
}
