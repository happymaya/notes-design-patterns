package cn.happymaya.ndp.strategy.base;

public class Context {
    public void request(IStrategy s) {
        s.operation();
    }
}
