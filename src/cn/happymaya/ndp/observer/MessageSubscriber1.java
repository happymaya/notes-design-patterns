package cn.happymaya.ndp.observer;

public class MessageSubscriber1 implements IMessageObserver{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber1 :: " + m.getContent());
    }
}
