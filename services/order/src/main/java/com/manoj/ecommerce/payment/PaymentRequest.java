package com.manoj.ecommerce.payment;

import com.manoj.ecommerce.customer.CustomerResponse;
import com.manoj.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
