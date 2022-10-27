package com.programmers.java.structural_patterns.proxy.virtual_proxy;

public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
