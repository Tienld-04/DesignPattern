package org.example.structural_patterns.Decorator;

// Các Decorator cụ thể (ConcreteDecorator)
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return decoratedCoffee.getDescription() + ", thêm sữa"; }
    public double getCost() { return decoratedCoffee.getCost() + 5.0; }
}