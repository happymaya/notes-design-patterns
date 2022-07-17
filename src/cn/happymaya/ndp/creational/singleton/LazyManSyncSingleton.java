package cn.happymaya.ndp.creational.singleton;

/* final 不允许被继承 */
public class LazyManSyncSingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    /* 在定义实例对象的时候直接初始化 */
    private static LazyManSyncSingleton instance = null;

    /* 私有构造方法，不允许外部 new */
    private LazyManSyncSingleton(){}

    /* 向 getInstance 方法加入同步控制，每次只能有一个线程能够进入 */
    private static synchronized LazyManSyncSingleton getInstance() {
        if (null == instance) {
            instance = new LazyManSyncSingleton();
        }
        return instance;
    }
}
