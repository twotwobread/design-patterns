package com.programmers.java.behavioral_patterns.visitor;

public class City implements Node{

    private final String id;
    private final String name;
    private final int population;

    public City(String id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCity(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
