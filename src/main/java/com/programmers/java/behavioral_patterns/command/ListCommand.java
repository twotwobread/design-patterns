package com.programmers.java.behavioral_patterns.command;

import java.util.List;

public class ListCommand implements Command{

    private final VoucherRepository repository;

    public ListCommand(VoucherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.println("바우처 리스트를 조회합니다.");
        repository.getVoucherList().forEach(System.out::println);
    }
}
