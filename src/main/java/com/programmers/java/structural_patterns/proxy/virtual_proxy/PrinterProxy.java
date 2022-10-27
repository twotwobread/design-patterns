package com.programmers.java.structural_patterns.proxy.virtual_proxy;

public class PrinterProxy implements Printable{
    private String name;
    private Printer printer = null;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        printer.print(string);
    }

    private void realize() {
        if (printer == null) {
            printer = new Printer(name);
        }
    }
}
