package cn.happymaya.ndp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements ISubject {

    private List<IMessageObserver> observers = new ArrayList<>();

    @Override
    public void attach(IMessageObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(IMessageObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        observers.forEach(x->x.update(m));
    }

}
