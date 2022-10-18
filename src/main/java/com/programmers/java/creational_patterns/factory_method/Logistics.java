package com.programmers.java.creational_patterns.factory_method;

public abstract class Logistics {
    abstract Transport createTransport();
    void run() {
        Transport transport = createTransport();
        transport.go();
    }
}
