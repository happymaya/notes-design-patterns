package cn.happymaya.ndp.decorator;

/* 具体装饰器 B */
public class DecoratorB extends BaseDecorator{

    public DecoratorB(IComponent wrapper) {
        super(wrapper);
    }

    @Override
    public void excute() {
        super.excute();
    }

}
