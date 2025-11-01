package org.example.creational_patterns.Prototype.test;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", 10);
        Circle circle2 = circle1.clone();  // sao chép từ circle1

        System.out.println(circle1);  // Circle [color=red, radius=10]
        System.out.println(circle2);  // Circle [color=red, radius=10]

        // Thay đổi circle2 không ảnh hưởng đến circle1
        circle2 = new Circle("blue", 10);
        circle2.setRadius(15);
        System.out.println(circle1);  // Circle [color=red, radius=10]
        System.out.println(circle2);  // Circle [color=blue, radius=10]
    }
}
