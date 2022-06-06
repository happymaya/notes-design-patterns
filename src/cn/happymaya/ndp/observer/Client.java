package cn.happymaya.ndp.observer;

public class Client {
    public static void main(String[] args) {
        IMessageObserver s1 = new MessageSubscriber1();
        IMessageObserver s2 = new MessageSubscriber2();
        IMessageObserver s3 = new MessageSubscriber3();
        ISubject p = new MessagePublisher();
        p.attach(s1);
        p.attach(s2);
        /* s1 和 s2 会收到消息通知 */
        p.notifyUpdate(new Message("First Message"));
        p.detach(s1);
        p.attach(s3);
        /* s2 和 s3 会收到消息通知 */
        p.notifyUpdate(new Message("Second Message"));
    }
}
