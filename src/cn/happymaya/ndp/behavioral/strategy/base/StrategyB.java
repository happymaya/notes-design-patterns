package cn.happymaya.ndp.behavioral.strategy.base;

public class StrategyB implements IStrategy{
    @Override
    public void operation() {
        System.out.println("=== 执行策略 B ......");
    }
}
