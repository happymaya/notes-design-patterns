package cn.happymaya.ndp.observer;

public interface ISubject {

    /* 增加观察者 */
    void attach(IMessageObserver o);
    /* 删除观察者 */
    void detach(IMessageObserver o);
    /* 更新通知 */
    void notifyUpdate(Message m);

}
