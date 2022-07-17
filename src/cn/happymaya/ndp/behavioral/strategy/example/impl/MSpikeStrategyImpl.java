package cn.happymaya.ndp.behavioral.strategy.example.impl;

import cn.happymaya.ndp.behavioral.strategy.example.IPromotionStrategy;

public class MSpikeStrategyImpl implements IPromotionStrategy {
    @Override
    public int recommand(String skuId) {
        System.out.println("=== 执行 M 元秒杀活动");
        //推荐算法和逻辑写这里
        return 3;
    }
}
