package com.vikas.lld.singleton;

public class Test {
    public static void main(String[] args) {
        EagerSingleton singletonX = EagerSingleton.getInstance();
        EagerSingleton singletonY = EagerSingleton.getInstance();

        System.out.println(singletonX);
        System.out.println(singletonY);

        singletonY.setA(100);
        System.out.println(singletonX.getA());
        System.out.println(singletonY.getA());

        LazySingleton lazySingletonX = LazySingleton.getInstance();
        LazySingleton lazySingletonY = LazySingleton.getInstance();

        lazySingletonY.setA(20);

        System.out.println(lazySingletonX.getA());
        System.out.println(lazySingletonY.getA());

        ThreadSafeSingleton threadSafeSingletonX = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingletonY = ThreadSafeSingleton.getInstance();

        threadSafeSingletonX.setA(30);
        threadSafeSingletonY.setA(40);

        System.out.println(threadSafeSingletonX.getA());
        System.out.println(threadSafeSingletonY.getA());

        DoubleCheckLockingSingleton doubleCheckLockingSingletonX = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton doubleCheckLockingSingletonY = DoubleCheckLockingSingleton.getInstance();

        doubleCheckLockingSingletonY.setA(20);
        System.out.println(doubleCheckLockingSingletonX.getA());
        System.out.println(doubleCheckLockingSingletonY.getA());

        BillPughSingleton billPughSingletonX = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingletonY = BillPughSingleton.getInstance();

        billPughSingletonX.setA(50);
        System.out.println(billPughSingletonX.getA());
        System.out.println(billPughSingletonY.getA());
    }
}
