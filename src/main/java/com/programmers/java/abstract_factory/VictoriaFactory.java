package com.programmers.java.abstract_factory;

public class VictoriaFactory implements Factory{
    @Override
    public Chair createChair() {
        return new VictoriaChair();
    }

    @Override
    public Table createTable() {
        return new VictoriaTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictoriaSofa();
    }

}
