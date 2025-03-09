package com.vikas.lld.builderPattern;

public class Test {
    public static void main(String[] args) {
        Computer cmp = new Computer.ComputerBuilder("Inspiron 5320U", "DELL", "Silver", 16.0f)
                .setGraphicsCardMemory(4.0f)
                .setHasGamingCapability(true)
                .setTurbofan(true)
                .build();

        System.out.println(cmp.toString());
    }
}
