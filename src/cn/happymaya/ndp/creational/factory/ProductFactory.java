package cn.happymaya.ndp.creational.factory;

/* 核心工厂类 */
public class ProductFactory {
    public static IProduct getProduct(String name){
        if ("a".equals(name)) {
            return new ProductAImpl();
        }
        return new ProductBImpl();
    }
}
