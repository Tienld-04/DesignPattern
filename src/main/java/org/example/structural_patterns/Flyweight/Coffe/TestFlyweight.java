package org.example.structural_patterns.Flyweight.Coffe;

public class TestFlyweight {
    public static void main(String[] args) {
        Coffee espresso1 = CoffeeFactory.getCoffee("Espresso");
        espresso1.serve("Bàn 1", "Nhỏ");

        Coffee espresso2 = CoffeeFactory.getCoffee("Espresso");
        espresso2.serve("Bàn 2", "Lớn");

        Coffee cappuccino = CoffeeFactory.getCoffee("Cappuccino");
        cappuccino.serve("Bàn 3", "Vừa");
    }
}
