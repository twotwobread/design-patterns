package com.programmers.java.creational_patterns.factory_method;

public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
