package cn.happymaya.ndp.decorator;

/* 具体装饰器 A */
public class DecoratorA extends BaseDecorator{

    public DecoratorA(IComponent wrapper) {
        super(wrapper);
    }

    @Override
    public void excute() {
        super.excute();
    }
}
