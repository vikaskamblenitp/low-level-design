package com.vikas.lld.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private int a;

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
