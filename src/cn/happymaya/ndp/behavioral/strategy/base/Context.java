package cn.happymaya.ndp.behavioral.strategy.base;

public class Context {
    public void request(IStrategy s) {
        s.operation();
    }
}
