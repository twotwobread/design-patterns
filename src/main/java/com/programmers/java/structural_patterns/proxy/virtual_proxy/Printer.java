package com.programmers.java.structural_patterns.proxy.virtual_proxy;

public class Printer implements Printable{
    private String name;
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name + ") 생성 중...");
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
        System.out.println("+++ " + name + " +++");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "초 소요");
        }
        System.out.println("완료 !!");
    }
}
