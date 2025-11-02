package org.example.creational_patterns.Prototype.smart_phone;

public class Main {
    public static void main(String[] args) {
        Prototype phoneMau = new Phone("Phone X", "Snapdragon 8 Gen 2",
                8, 256, "Android 14", "English");

        Prototype phoneVN = phoneMau.clone();
        phoneVN.setLanguage("Vietnamese");

        Prototype phoneJP = phoneMau.clone();
        phoneJP.setLanguage("Japanese");

        Prototype phoneUS = phoneMau.clone();
        phoneUS.setLanguage("English");

        System.out.println("Điện thoại mẫu gốc:");
        phoneMau.showInfo();

        System.out.println("\nCác bản clone cho từng thị trường:");
        phoneVN.showInfo();
        phoneJP.showInfo();
        phoneUS.showInfo();
    }
}
