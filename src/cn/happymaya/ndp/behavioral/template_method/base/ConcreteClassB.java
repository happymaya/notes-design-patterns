package cn.happymaya.ndp.behavioral.template_method.base;

public class ConcreteClassB extends AbstractClassTemplate {
    @Override
    void step3() {
        System.out.println("===在子类 B 中 执行：步骤3");
    }
    @Override
    void step4() {
        System.out.println("===在子类 B 中 执行：步骤4");
    }
}
