package com.vikas.lld.singleton;

public class DoubleCheckLockingSingleton {
    private static DoubleCheckLockingSingleton instance;

    private int a;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
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
