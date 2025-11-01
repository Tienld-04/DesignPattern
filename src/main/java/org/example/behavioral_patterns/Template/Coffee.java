package org.example.behavioral_patterns.Template;

// Cà phê
class Coffee extends Beverage {
    protected void brew() {
        System.out.println("Pha cà phê qua phin");
    }
    protected void addCondiments() {
        System.out.println("Thêm sữa và đường");
    }
}
