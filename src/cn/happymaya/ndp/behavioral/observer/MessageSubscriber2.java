package cn.happymaya.ndp.behavioral.observer;

public class MessageSubscriber2 implements IMessageObserver{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber2 :: " + m.getContent());
    }
}
