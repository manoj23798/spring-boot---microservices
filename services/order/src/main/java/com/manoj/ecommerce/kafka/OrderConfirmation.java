package com.manoj.ecommerce.kafka;

import com.manoj.ecommerce.customer.CustomerResponse;
import com.manoj.ecommerce.order.PaymentMethod;
import com.manoj.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
