package com.vikas.lld.observerPattern;

public interface IPublisher {
    void subscribe(ISubscriber ob);
    void unsubscribe(ISubscriber ob);
    void notifySubscriber();
    void setMessage(String msg);
    String getMessage();
}
