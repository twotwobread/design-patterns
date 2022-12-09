package com.programmers.java.behavioral_patterns.command;

public class Voucher {
    private final long id;
    private final int dicountAmount;

    public Voucher(long id, int dicountAmount) {
        this.id = id;
        this.dicountAmount = dicountAmount;
    }

    @Override
    public String toString() {
        return "Voucher Info { " +
                "id = " + id +
                ", dicountAmount = " + dicountAmount +
                " }";
    }
}
