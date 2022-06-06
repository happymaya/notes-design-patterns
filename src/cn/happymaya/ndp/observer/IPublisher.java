package cn.happymaya.ndp.observer;

import java.util.Observer;

public interface IPublisher {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notify(double amt);
}
