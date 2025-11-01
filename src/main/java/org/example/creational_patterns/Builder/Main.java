package org.example.creational_patterns.Builder;

public class Main {
//    private final ComputerDirector director;
//
//    public Client(ComputerDirector director) {
//        this.director = director;
//    }
//
//    // Client chỉ gọi qua interface Builder
//    public Computer createComputer(Builder builder) {
//        director.construct(builder);
//        return builder.getResult();
//    }
    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();
        gamingComputer.displayInfo();

        OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.construct(officeBuilder);
        Computer officeComputer = officeBuilder.getResult();
        officeComputer.displayInfo();
    }
}
