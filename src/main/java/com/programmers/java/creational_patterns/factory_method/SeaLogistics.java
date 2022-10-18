package com.programmers.java.creational_patterns.factory_method;

public class SeaLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
