package cn.happymaya.ndp.observer.impl;

import cn.happymaya.ndp.observer.IObserver;
import cn.happymaya.ndp.observer.IPublisher;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements IPublisher {

    private String acct;
    private double balance;
    private List<IObserver> myObservers;

    public PublisherImpl(String anAcct, double aBalance){
        this.acct = anAcct;
        this.balance = aBalance;
        this.myObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver o) {
        myObservers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        myObservers.remove(o);
    }

    @Override
    public void notify(double amt) {
        balance -= amt;
        if (balance < 0) {
            overdrawn();
        }
    }

    private void overdrawn() {
        for (IObserver o : myObservers) {
            o.notify(acct, balance);
        }
    }
}
