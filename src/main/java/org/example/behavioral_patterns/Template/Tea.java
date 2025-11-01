package org.example.behavioral_patterns.Template;

// Trà
class Tea extends Beverage {
    protected void brew() {
        System.out.println("Ngâm trà trong nước nóng");
    }
    protected void addCondiments() {
        System.out.println("Thêm chanh và mật ong");
    }
}
