package cn.happymaya.ndp.structural.decorator;

/* 装饰器 */
public class BaseDecorator implements IComponent{

    private IComponent wrapper;

    public BaseDecorator(IComponent wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void excute() {
        wrapper.excute();
    }

}
