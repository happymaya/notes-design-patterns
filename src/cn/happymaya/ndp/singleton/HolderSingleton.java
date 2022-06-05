package cn.happymaya.ndp.singleton;

/* final 不允许被继承 */
public class HolderSingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    /* 私有构造方法，不允许外部 new */
    private HolderSingleton(){}

    /* 在静态内部类中持有 Singleton 的实例，并且可能直接初始化 */
    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    /* 调用 getInstance 方法，事实上是获得 Holder 的 instance 静态属性 */
    public static HolderSingleton getInstance() {
        return Holder.instance;
    }
}
