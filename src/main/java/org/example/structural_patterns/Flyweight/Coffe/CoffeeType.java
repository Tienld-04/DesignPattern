package org.example.structural_patterns.Flyweight.Coffe;

// ConcreteFlyweight
class CoffeeType implements Coffee {
    private String flavor; // intrinsic state (phần chia sẻ – công thức pha)

    public CoffeeType(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve(String table, String size) {
        System.out.println("Phục vụ cà phê " + flavor + " (" + size + ") cho bàn " + table);
    }
}