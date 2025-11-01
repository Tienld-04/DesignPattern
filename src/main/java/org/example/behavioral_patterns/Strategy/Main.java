package org.example.behavioral_patterns.Strategy;

// 4. Client
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(100);

        context.setStrategy(new EWalletPayment());
        context.executePayment(200);

        context.setStrategy(new CashPayment());
        context.executePayment(50);
    }
}