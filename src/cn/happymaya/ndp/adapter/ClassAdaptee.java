package cn.happymaya.ndp.adapter;

public class ClassAdaptee extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
