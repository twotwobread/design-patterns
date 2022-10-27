package com.programmers.java.structural_patterns.proxy.virtual_proxy;

import com.programmers.java.structural_patterns.proxy.Simulation;

public class SimulationVirtual implements Simulation {
    @Override
    public void run() {
        Printable printer;

        System.out.println("********** 진짜 프린터를 이용해서 뽑는 상황 ***********");
        printer = new Printer("이전 사람");
        printer.setPrinterName("이수영");
        System.out.println(printer.getPrinterName()); // 프린트 뽑을 사람의 이름 출력
        printer.setPrinterName("다른 사람");
        System.out.println(printer.getPrinterName()); // 프린트 뽑을 사람의 이름 출력

        System.out.println("\n3만년 후 .....\n");

        System.out.println("출력 시작 !");
        printer.print("내가 뽑을 출력물 내용 !!!!!");

        System.out.println();

        System.out.println("********** 프린터 프록시을 이용해서 뽑는 상황 ***********");
        printer = new PrinterProxy("이전 사람");
        printer.setPrinterName("이수영"); // 프린트 뽑고 싶은 사람의 이름을 설정함.
        System.out.println(printer.getPrinterName()); // 프린트 뽑을 사람의 이름 출력
        printer.setPrinterName("다른 사람"); // 프린트 뽑을 사람 이름을 다시 설정.
        System.out.println(printer.getPrinterName()); // 프린트 뽑을 사람의 이름 출력

        System.out.println("\n3만년 후 .....\n");

        System.out.println("출력 시작 !");
        printer.print("내가 뽑을 출력물 내용 !!!!!");
    }
}
