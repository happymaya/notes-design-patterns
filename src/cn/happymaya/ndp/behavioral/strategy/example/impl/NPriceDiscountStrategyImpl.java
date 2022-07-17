package cn.happymaya.ndp.behavioral.strategy.example.impl;

import cn.happymaya.ndp.behavioral.strategy.example.IPromotionStrategy;

public class NPriceDiscountStrategyImpl implements IPromotionStrategy {
    @Override
    public int recommand(String skuId) {
        System.out.println("=== 执行 N 折扣优惠活动");
        //推荐算法和逻辑写这里
        return 2;
    }
}
