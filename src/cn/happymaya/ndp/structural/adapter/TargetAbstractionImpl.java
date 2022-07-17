package cn.happymaya.ndp.structural.adapter;

public class TargetAbstractionImpl extends TargetAbstraction{
    @Override
    public String filter(String str) {
        return str.replaceAll("a", "A");
    }
}
