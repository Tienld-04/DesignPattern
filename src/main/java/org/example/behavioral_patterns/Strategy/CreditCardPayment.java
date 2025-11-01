package org.example.behavioral_patterns.Strategy;

// 2. Concrete strategies
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.");
    }
}
