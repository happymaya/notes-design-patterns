package cn.happymaya.ndp.creational.singleton;

/* 枚举类型本身是 final 的，不允许被继承 */
public class EnumLazySingleton {

    /* 实例变量 */
    private byte[] data = new byte[1024];

    private EnumLazySingleton(){}

    /* 使用枚举充当 holder */
    private enum EnumHolder{
        INSTANCE;

        private EnumLazySingleton instance;

        EnumHolder() {
            this.instance = new EnumLazySingleton();
        }

        private EnumLazySingleton getEnumLazySingleton() {
            return instance;
        }
    }

    public static EnumLazySingleton getInstance() {
        return EnumHolder.INSTANCE.getEnumLazySingleton();
    }
}
