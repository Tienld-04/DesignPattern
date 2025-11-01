package org.example.behavioral_patterns.Strategy;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng ví điện tử.");
    }
}