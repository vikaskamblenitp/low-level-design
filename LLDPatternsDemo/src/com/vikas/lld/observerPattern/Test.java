package com.vikas.lld.observerPattern;

public class Test {
    public static void main(String[] args) {
        IPublisher pub = new QProducer();
        ISubscriber sub = new QConsumer(pub);

        pub.subscribe(sub);
        pub.setMessage("HELLO");
        pub.setMessage("BYE");
        pub.setMessage("HELLO");
        pub.unsubscribe(sub);
        pub.setMessage("BYE");
    }
}
