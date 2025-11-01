package org.example.creational_patterns.FactoryMethod.Animal;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory;
        Animal animal;
        //tạo con mèo
        
        factory = new CatFactory();
        animal = factory.createAnimal();
        animal.speak();

        //tạo con chó
        factory = new DogFactory();
        animal = factory.createAnimal();
        animal.speak();
    }
}
