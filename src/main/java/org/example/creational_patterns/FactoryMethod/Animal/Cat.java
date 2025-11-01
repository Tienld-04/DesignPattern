package org.example.creational_patterns.FactoryMethod.Animal;
//Concrete Product (Sản phẩm cụ thể)
public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meo meo!");
    }
}