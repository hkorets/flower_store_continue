package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public String getPaymentMethod() {
        return "Paid by PayPal";
    }
}
