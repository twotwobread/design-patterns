package com.programmers.java.behavioral_patterns.command;

import com.programmers.java.behavioral_patterns.command.Voucher;

import java.util.ArrayList;
import java.util.List;

public class VoucherRepository {
    private static long id = 0L;
    private static final List<Voucher> repo = new ArrayList<>();

    public void insert(Voucher voucher) {
        repo.add(voucher);
    }

    public List<Voucher> getVoucherList() {
        return repo;
    }
    
    public long generateId() {
        id += 1;
        return id;
    }
}
