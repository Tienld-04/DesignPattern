package org.example.creational_patterns.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonLazyMultithreaded instance2 = SingletonLazyMultithreaded.getInstance();
        SingletonLazyMultithreaded instance1 = SingletonLazyMultithreaded.getInstance();


        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());

        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
