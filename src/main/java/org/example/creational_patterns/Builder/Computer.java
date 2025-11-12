package org.example.creational_patterns.Builder;
// Product
public class Computer {

    private String cpu_;
    private String ram_;
    private String storage_;

    public void setCPU(String cpu) {
        cpu_ = cpu;
    }

    public void setRAM(String ram) {
        ram_ = ram;
    }

    public void setStorage(String storage) {
        storage_ = storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:"
                + "\nCPU: " + cpu_
                + "\nRAM: " + ram_
                + "\nStorage: " + storage_ + "\n\n");
    }
}
