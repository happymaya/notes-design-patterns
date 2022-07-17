package cn.happymaya.ndp.behavioral.observer;

import cn.happymaya.ndp.behavioral.observer.impl.ObserverImpl;
import cn.happymaya.ndp.behavioral.observer.impl.PublisherImpl;

public class Demo {
    public static void main(String[] args) {
        IPublisher account = new PublisherImpl("TEST123", 10.00);
        IObserver bill = new ObserverImpl();
        account.addObserver(bill);
        account.notify(11.00);
    }
}
