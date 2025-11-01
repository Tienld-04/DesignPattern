package org.example.structural_patterns.Flyweight.Arrow;

class ArrowModel implements Arrow {
    private String color;   // intrinsic state
    private String shape;   // intrinsic state

    public ArrowModel(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public void draw(int x, int y, double angle) {
        System.out.println("Vẽ mũi tên màu " + color +
                ", dạng " + shape +
                " tại (" + x + ", " + y + "), góc " + angle + "°");
    }
}
