package cn.happymaya.ndp.strategy.example;

public class Promotional {
    private final IPromotionStrategy strategy;
    public Promotional(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }
    public void recommand(String skuId) {
        strategy.recommand(skuId);
    }
}
