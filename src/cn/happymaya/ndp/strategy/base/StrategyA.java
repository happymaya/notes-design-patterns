package cn.happymaya.ndp.strategy.base;

public class StrategyA implements IStrategy{
    @Override
    public void operation() {
        System.out.println("=== 执行策略 A ......");
    }
}
