package com.vikas.lld.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class QProducer implements IPublisher {
    private final List<ISubscriber> subscribers;
    private String message;

    public QProducer() {
        subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(ISubscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void unsubscribe(ISubscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for (ISubscriber sub : subscribers) {
            sub.update();
        }
    }

    public void setMessage(String msg) {
        this.message = msg;
        this.notifySubscriber();
    }

    public String getMessage() {
        return  this.message;
    }
}
