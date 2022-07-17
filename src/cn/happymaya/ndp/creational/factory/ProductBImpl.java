package cn.happymaya.ndp.creational.factory;

/* 具体产品实现 B */
public class ProductBImpl implements IProduct{
    @Override
    public void apply() {
        System.out.println("use B product now");
    }
}
