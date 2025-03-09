package com.vikas.lld.builderPattern;

public class Computer {
    private String name;
    private String brand;
    private String color;
    private float ram;
    private float graphicsCardMemory;
    private boolean turbofan;
    private boolean hasCamera;
    private boolean hasGamingCapability;


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", graphicsCardMemory=" + graphicsCardMemory +
                ", turbofan=" + turbofan +
                ", hasCamera=" + hasCamera +
                ", hasGamingCapability=" + hasGamingCapability +
                '}';
    }

    private Computer(ComputerBuilder cb) {
        this.name = cb.name;
        this.brand = cb.brand;
        this.color = cb.color;
        this.ram = cb.ram;
        this.hasCamera = cb.hasCamera;
        this.graphicsCardMemory = cb.graphicsCardMemory;
        this.turbofan = cb.turbofan;
        this.hasGamingCapability = cb.hasGamingCapability;
    }

    public static class ComputerBuilder {
        private String name;
        private String brand;
        private String color;
        private float ram;
        private float graphicsCardMemory;
        private boolean turbofan;
        private boolean hasCamera;
        private boolean hasGamingCapability;

        public ComputerBuilder(String name, String brand, String color, float ram) {
            this.name = name;
            this.brand = brand;
            this.color = color;
            this.ram = ram;
        }

        public ComputerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ComputerBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ComputerBuilder setRam(float ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGraphicsCardMemory(float graphicsCardMemory) {
            this.graphicsCardMemory = graphicsCardMemory;
            return this;
        }

        public ComputerBuilder setTurbofan(boolean turbofan) {
            this.turbofan = turbofan;
            return this;
        }

        public ComputerBuilder setHasCamera(boolean hasCamera) {
            this.hasCamera = hasCamera;
            return this;
        }

        public ComputerBuilder setHasGamingCapability(boolean hasGamingCapability) {
            this.hasGamingCapability = hasGamingCapability;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
