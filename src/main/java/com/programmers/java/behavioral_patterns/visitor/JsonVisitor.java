package com.programmers.java.behavioral_patterns.visitor;

public class JsonVisitor implements Visitor{
    @Override
    public void visitCity(City city) {
        System.out.println("{");
        System.out.println("    id : " + city.getId());
        System.out.println("    name : " + city.getName());
        System.out.println("    population : " + city.getPopulation());
        System.out.println("}");
    }

    @Override
    public void visitIndustry(Industry industry) {
        System.out.println("{");
        System.out.println("    id : " + industry.getId());
        System.out.println("    name : " + industry.getName());
        System.out.println("    subjects : " + industry.getSubjects());
        System.out.println("}");
    }
}
