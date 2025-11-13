package org.example.structural_patterns.Flyweight.Coffee;

// Flyweight Factory
class CoffeeFactory {
    private static final java.util.Map<String, Coffee> coffeeMap = new java.util.HashMap<>();

    public static Coffee getCoffee(String flavor) {
        Coffee coffee = coffeeMap.get(flavor);
        if (coffee == null) {
            coffee = new CoffeeType(flavor);
            coffeeMap.put(flavor, coffee);
            System.out.println("Pha công thức mới cho loại cà phê: " + flavor);
        }
        return coffee;
    }
}
