package org.example.creational_patterns.Builder.FormBuilder;

public class FormBuilderComputer {
    private String cpu;
    private String ram;
    private String storage;

    public FormBuilderComputer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }
    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public FormBuilderComputer build(){
            return new FormBuilderComputer(this);
        }
    }

    @Override
    public String toString() {
        return "FormBuilderComputer: [" +
                "storage='" + storage + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ']';
    }

    public static void main(String[] args) {
        FormBuilderComputer cp = new FormBuilderComputer.Builder()
                .setCPU("Intel Core I7-11850H")
                .setRam("32GB")
                .setStorage("512")
                .build();
        System.out.println(cp);
        Builder b = new Builder();
        b.setStorage("jhjk");
        b.setRam("df");
        b.setCPU("FSD");
        FormBuilderComputer cb = new FormBuilderComputer(b);
        System.out.println(cb);


    }
}
