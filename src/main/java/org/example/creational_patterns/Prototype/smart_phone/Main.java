package org.example.creational_patterns.Prototype.smart_phone;

public class Main {
    public static void main(String[] args) {
        Phone phoneMau = new Phone("Phone X", "Snapdragon 8 Gen 2", 8, 256, "Android 14", "English");

        //Clone cho các thị trường khác nhau
        Phone phoneVN = phoneMau.clone();
        phoneVN.setLanguage("Vietnamese");

        Phone phoneJP =  phoneMau.clone();
        phoneJP.setLanguage("Japanese");

        Phone phoneUS = phoneMau.clone();
        phoneUS.setLanguage("English");

        System.out.println("Điện thoại mẫu gốc:");
        phoneMau.showInfo();

        System.out.println("\nCác bản clone cho từng thị trường:");
        phoneVN.showInfo();
        phoneJP.showInfo();
        phoneUS.showInfo();
    }
}
