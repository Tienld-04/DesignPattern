package org.example.creational_patterns.Prototype.smart_phone;

public interface Prototype extends Cloneable {
    Prototype clone();
    void setLanguage(String language);
    void showInfo();
}