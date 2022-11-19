package com.programmers.java.creational_patterns.builder;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class VoucherBuilder {
    private final UUID voucherId = UUID.randomUUID();
    private double discountAmount = 1000;
    private String voucherType = "FixedAmountVoucher";
    private UUID ownedCustomerId = null;
    private final LocalDateTime createdAt = LocalDateTime.now();

    public VoucherBuilder setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    public VoucherBuilder setVoucherType(String voucherType) {
        this.voucherType = voucherType;
        return this;
    }

    public VoucherBuilder setOwnedCustomerId(UUID ownedCustomerId) {
        this.ownedCustomerId = ownedCustomerId;
        return this;
    }

    public Voucher build() {
        if (Objects.equals(voucherType, "FixedAmountVoucher")) {
            return new FixedAmountVoucher(voucherId, discountAmount, voucherType, ownedCustomerId, createdAt);
        }

        return new PercentDiscountVoucher(voucherId, discountAmount, voucherType, ownedCustomerId, createdAt);
    }
}
