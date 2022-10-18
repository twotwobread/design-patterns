package com.programmers.java.factory_method;

public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
