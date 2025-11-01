package org.example.structural_patterns.Decorator;

// Lớp cơ bản ConcreteComponent
public class SimpleCoffee implements Coffee {
    public String getDescription() { return "Cà phê đen"; }
    public double getCost() { return 10.0; }
}