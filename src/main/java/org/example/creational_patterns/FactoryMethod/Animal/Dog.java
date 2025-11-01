package org.example.creational_patterns.FactoryMethod.Animal;
//Concrete Product (Sản phẩm cụ thể)
public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Gâu gâu!");
    }
}
