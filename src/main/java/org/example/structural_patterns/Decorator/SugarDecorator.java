package org.example.structural_patterns.Decorator;
// Các Decorator cụ thể (ConcreteDecorator)
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return decoratedCoffee.getDescription() + ", thêm đường"; }
    public double getCost() { return decoratedCoffee.getCost() + 2.0; }
}