package cn.happymaya.ndp.adapter;

// 适配者接口
public class Adaptee {
    void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
