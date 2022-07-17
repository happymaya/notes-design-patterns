package cn.happymaya.ndp.creational.factory;

/* 具体产品实现 A */
public class ProductAImpl implements IProduct {
    @Override
    public void apply() {
        System.out.println("use A product now");
    }
}
