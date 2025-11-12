package org.example.creational_patterns.Builder;
// Builder
public interface Builder {
    void buildCPU();

    void buildRAM();

    void buildStorage();

    Computer getResult();
}
