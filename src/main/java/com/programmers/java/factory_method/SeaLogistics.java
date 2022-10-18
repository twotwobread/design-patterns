package com.programmers.java.factory_method;

public class SeaLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
