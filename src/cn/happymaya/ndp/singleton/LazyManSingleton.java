package cn.happymaya.ndp.singleton;

/* final 不允许被继承 */
public class LazyManSingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    /* 在定义实例对象的时候直接初始化 */
    private static LazyManSingleton instance = null;

    /* 私有构造方法，不允许外部 new */
    private LazyManSingleton(){}

    private static LazyManSingleton getInstance() {
        if (null == instance) {
            instance = new LazyManSingleton();
        }
        return instance;
    }

}
