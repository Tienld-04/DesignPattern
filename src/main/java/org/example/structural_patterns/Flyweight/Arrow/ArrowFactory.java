package org.example.structural_patterns.Flyweight.Arrow;

class ArrowFactory {
    private static final java.util.Map<String, Arrow> arrows = new java.util.HashMap<>();

    public static Arrow getArrow(String color, String shape) {
        String key = color + "-" + shape;
        Arrow arrow = arrows.get(key);
        if (arrow == null) {
            arrow = new ArrowModel(color, shape);
            arrows.put(key, arrow);
            System.out.println("Tạo mô hình mũi tên mới: " + key);
        }
        return arrow;
    }
}
