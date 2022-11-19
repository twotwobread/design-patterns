package com.programmers.java.creational_patterns.builder;

import java.time.LocalDateTime;
import java.util.UUID;

// Builder
public class DataSourceBuilder {
    public static void main(String[] args) {
        Voucher voucher = new VoucherBuilder()
                .setVoucherType("PercentDiscountVoucher")
                .setOwnedCustomerId(UUID.randomUUID())
                .setDiscountAmount(80)
                .build();

        Voucher voucher2 = new VoucherBuilder()
                .setVoucherType("PercentDiscountVoucher")
                .setDiscountAmount(80)
                .build();

        System.out.println(voucher);
        System.out.println(voucher2);
    }
}
