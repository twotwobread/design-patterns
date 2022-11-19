package com.programmers.java.creational_patterns.builder;

import java.time.LocalDateTime;
import java.util.UUID;

public class Voucher {
    private final UUID voucherId;
    private final double discountAmount;
    private final String voucherType;
    private UUID ownedCustomerId;
    private final LocalDateTime createdAt;

    public Voucher(UUID voucherId, double discountAmount, String voucherType, UUID ownedCustomerId, LocalDateTime createdAt) {
        this.voucherId = voucherId;
        this.discountAmount = discountAmount;
        this.voucherType = voucherType;
        this.ownedCustomerId = ownedCustomerId;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "voucherId=" + voucherId +
                ", discountAmount=" + discountAmount +
                ", voucherType='" + voucherType + '\'' +
                ", ownedCustomerId=" + ownedCustomerId +
                ", createdAt=" + createdAt +
                '}';
    }
}
