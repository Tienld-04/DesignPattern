package org.example.behavioral_patterns.Template;

// Lớp trừu tượng định nghĩa template
abstract class Beverage {

    // Template Method - final để ngăn override
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    // Abstract methods - bắt buộc implement
    protected abstract void brew();
    protected abstract void addCondiments();

    // Concrete methods - implementation chung
    private void boilWater() {
        System.out.println("Đun sôi nước");
    }

    private void pourInCup() {
        System.out.println("Rót ra ly");
    }

    // Hook method - có thể override
    protected boolean wantsCondiments() {
        return true;
    }
}
