package cn.happymaya.ndp.singleton;

/* 枚举类型本身是 final 的，不允许被继承 */
public enum EnumSingleton {

    INSTANCE;

    // 实例变量
    private byte[] data = new byte[1024];


    EnumSingleton(){
        System.out.println("INSTANCE will be initialized immediately...");
    }

    public static void method() {
        // 调用该方法，则会主动使用 Singleton，INSTANCE 将会被实例化
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
