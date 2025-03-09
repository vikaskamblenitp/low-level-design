package com.vikas.lld.observerPattern;

public class QConsumer implements ISubscriber {
    private final IPublisher pub;

    public QConsumer(IPublisher pub) {
        this.pub = pub;
    }
    @Override
    public void update() {
        String message = pub.getMessage();
        switch (message) {
            case "HELLO":
                System.out.println("Pub sub is live");
                break;
            case "BYE":
                System.out.println("Pub sub is offline");

            default: break;
        }
    }
}
