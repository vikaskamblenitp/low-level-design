package com.vikas.lld.singleton;

public class BillPughSingleton {
    private int a;

    private BillPughSingleton() {}

    private static class BillPughSingletonHelper {
        public static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.INSTANCE;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
