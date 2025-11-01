package org.example.structural_patterns.Flyweight.Arrow;

public class Client {
    public static void main(String[] args) {
        Arrow arrow1 = ArrowFactory.getArrow("Nâu", "Gỗ");
        arrow1.draw(10, 20, 45);

        Arrow arrow2 = ArrowFactory.getArrow("Nâu", "Gỗ");
        arrow2.draw(50, 60, 30);

        Arrow arrow3 = ArrowFactory.getArrow("Bạc", "Sắt");
        arrow3.draw(70, 80, 60);
    }
}
