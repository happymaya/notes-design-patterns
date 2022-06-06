package cn.happymaya.ndp.strategy.example;

import cn.happymaya.ndp.strategy.example.impl.FullReduceStrategyImpl;
import cn.happymaya.ndp.strategy.example.impl.MSpikeStrategyImpl;
import cn.happymaya.ndp.strategy.example.impl.NPriceDiscountStrategyImpl;

public class Client {
    public static void main(String[] args) {
        Promotional fullReducePromotional = new Promotional(new FullReduceStrategyImpl());
        fullReducePromotional.recommand("1122334455");
        Promotional nPriceDiscountPromotional = new Promotional(new NPriceDiscountStrategyImpl());
        nPriceDiscountPromotional.recommand("6677889900");
        Promotional mSpikePromotional = new Promotional(new MSpikeStrategyImpl());
        mSpikePromotional.recommand("11335577");
    }
}
