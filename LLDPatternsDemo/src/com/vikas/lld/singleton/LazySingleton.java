package com.vikas.lld.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    private int a;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
