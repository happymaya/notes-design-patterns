package cn.happymaya.ndp.creational.factory;

/* client 使用者 */
public class Client {
    public static void main(String[] args) {
        IProduct iProductb = ProductFactory.getProduct("");
        iProductb.apply();
        IProduct iProducta = ProductFactory.getProduct("a");
        iProducta.apply();
    }
}
