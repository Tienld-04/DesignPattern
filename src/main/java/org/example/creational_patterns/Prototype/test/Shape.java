package org.example.creational_patterns.Prototype.test;

public abstract class Shape implements Prototype{
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract Shape clone();

}
