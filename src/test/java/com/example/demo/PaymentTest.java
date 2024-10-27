package com.example.demo;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.payment.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testPayPalPaymentMethod() {
        Payment payPalPayment = new PayPalPaymentStrategy();
        assertEquals("Paid by PayPal", payPalPayment.getPaymentMethod(), 
                     "Payment method should be 'Paid by PayPal'");
    }

    @Test
    public void testCreditCardPaymentMethod() {
        Payment creditCardPayment = new CreditCardPaymentStrategy();
        assertEquals("Paid by Credit Card", creditCardPayment.getPaymentMethod(), 
                     "Payment method should be 'Paid by Credit Card'");
    }
}

