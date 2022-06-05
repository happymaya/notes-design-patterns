package cn.happymaya.ndp.singleton;

import java.net.Socket;
import java.sql.Connection;

/* final 不允许被继承 */
public class VolatileDoubleCheckSingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    /* 在定义实例对象的时候直接初始化 */
    private volatile static VolatileDoubleCheckSingleton instance = null;

    Connection connection;

    Socket socket;

    /* 私有构造方法，不允许外部 new */
    private VolatileDoubleCheckSingleton() {
        this.connection = null;    // 初始化 connection
        this.socket = null;        // 初始化 socket
    }

    private static VolatileDoubleCheckSingleton getInstance() {
        // 当 instance 为 null 时，进入同步代码块
        // 同时该判断避免了每次都需要进入同步代码块，可以提高些效率
        if (null == instance) {
            // 只有一个线程能够获取 DoubleCheckSingleton.class 关联的 monitor
            synchronized (DoubleCheckSingleton.class) {
                // 判断如果 instance 为 null ，则创建
                if (null == instance) {
                    instance = new VolatileDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
