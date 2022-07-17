package cn.happymaya.ndp.behavioral.observer.impl;

import cn.happymaya.ndp.behavioral.observer.IObserver;

public class ObserverImpl implements IObserver {
    @Override
    public void notify(String acct, double amt) {
        System.out.println("=== 接收到通知：账户："+acct + " 账单："+amt);
    }
}
