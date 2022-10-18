package com.programmers.java.factory_method;

public abstract class Logistics {
    abstract Transport createTransport();
    void run() {
        Transport transport = createTransport();
        transport.go();
    }
}
