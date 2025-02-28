package com.vikas.lld.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}
    private int a;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return  instance;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
