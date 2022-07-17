package cn.happymaya.ndp.behavioral.observer;

public class MessageSubscriber3 implements IMessageObserver{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber3 :: " + m.getContent());
    }
}
