package org.example.behavioral_patterns.Template;

public class TestTemplate {
    public static void main(String[] args) {
        System.out.println("CÀ PHÊ ");
        new Coffee().prepareRecipe();

        System.out.println("\n TRÀ ");
        new Tea().prepareRecipe();

        System.out.println("\n CÀ PHÊ ĐEN ");
        new BlackCoffee().prepareRecipe();
    }
}
