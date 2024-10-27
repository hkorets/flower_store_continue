package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String getPaymentMethod() {
        return "Paid by Credit Card";
    }
}
