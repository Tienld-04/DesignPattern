package org.example.creational_patterns.Prototype.smart_phone;

public class Phone implements Prototype{
    private String model;
    private String cpu;
    private int ram;
    private int rom;
    private String os;
    private String language;

    public Phone(String model, String cpu, int ram, int rom, String os, String language) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.language = language;
    }
    @Override
    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public Phone clone() {
        try {
            return (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void showInfo() {
        System.out.println("Model: " + model +
                " | CPU: " + cpu +
                " | RAM: " + ram + "GB" +
                " | ROM: " + rom + "GB" +
                " | OS: " + os +
                " | Language: " + language);
    }
}
