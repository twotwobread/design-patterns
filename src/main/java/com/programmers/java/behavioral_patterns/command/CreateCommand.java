package com.programmers.java.behavioral_patterns.command;

import com.programmers.java.behavioral_patterns.command.Voucher;

public class CreateCommand implements Command{

    private final VoucherRepository repository;

    public CreateCommand(VoucherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.println("바우처를 생성합니다.");
        repository.insert(new Voucher(repository.generateId(), 1000));
    }
}
