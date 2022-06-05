package cn.happymaya.ndp.singleton;

/* final 不允许被继承 */
public final class HungryManSingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    /* 在定义实例对象的时候直接初始化 */
    private static HungryManSingleton instance = new HungryManSingleton();

    /* 私有构造方法，不允许外部 new */
    private HungryManSingleton(){}

    private static HungryManSingleton getInstance() {
        return instance;
    }

}
