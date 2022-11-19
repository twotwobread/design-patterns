package com.programmers.java.creational_patterns.builder;

import java.time.LocalDateTime;
import java.util.UUID;

public class PercentDiscountVoucher extends Voucher {
    public PercentDiscountVoucher(UUID voucherId, double discountAmount, String voucherType, UUID ownedCustomerId, LocalDateTime createdAt) {
        super(voucherId, discountAmount, voucherType, ownedCustomerId, createdAt);
    }
}