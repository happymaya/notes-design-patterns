package cn.happymaya.ndp.observer;

import cn.happymaya.ndp.observer.impl.ObserverImpl;
import cn.happymaya.ndp.observer.impl.PublisherImpl;

public class Demo {
    public static void main(String[] args) {
        IPublisher account = new PublisherImpl("TEST123", 10.00);
        IObserver bill = new ObserverImpl();
        account.addObserver(bill);
        account.notify(11.00);
    }
}
