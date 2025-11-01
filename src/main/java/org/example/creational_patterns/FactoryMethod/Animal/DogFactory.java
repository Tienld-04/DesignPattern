package org.example.creational_patterns.FactoryMethod.Animal;
//Concrete Creator (Factory cụ thể)
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}