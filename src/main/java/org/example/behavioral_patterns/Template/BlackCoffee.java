package org.example.behavioral_patterns.Template;

// Cà phê đen - không thêm phụ gia
class BlackCoffee extends Beverage {
    protected void brew() {
        System.out.println("Pha cà phê đen");
    }
    protected void addCondiments() {}

    // Override hook method
    protected boolean wantsCondiments() {
        System.out.println("Không thêm phụ gia cho cà phê đen.");
        return false;
    }
}