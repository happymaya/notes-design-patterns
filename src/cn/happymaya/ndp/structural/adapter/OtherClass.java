package cn.happymaya.ndp.structural.adapter;

public class OtherClass {
    public OtherClass() {}

    public String replace(String str) {
        return str.replaceAll("<", "[");
    }

    public void preCheck(String str) {}

}
