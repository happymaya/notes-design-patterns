package cn.happymaya.ndp.behavioral.observer;

public interface IPublisher {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notify(double amt);
}
