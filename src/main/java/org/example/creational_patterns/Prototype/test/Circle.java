package org.example.creational_patterns.Prototype.test;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.getColor(), this.radius);
    }

    @Override
    public String toString() {
        return "Circle [color=" + getColor() + ", radius=" + radius + "]";
    }
}
