package cn.happymaya.ndp.behavioral.template_method.base;

public class Demo {
    public static void main(String[] args) {
        AbstractClassTemplate concreteClassA = new ConcreteClassA();
        concreteClassA.run("");
        System.out.println("===========");
        AbstractClassTemplate concreteClassB = new ConcreteClassB();
        concreteClassB.run("x");
    }
}

// === 在模板类里 执行步骤 1
// === 在模板类里 执行步骤 2
// ===在子类 A 中 执行：步骤4
// === 在模板类里 执行步骤 5
// ===========
// === 在模板类里 执行步骤 1
// === 在模板类里 执行步骤 2
// ===在子类 B 中 执行：步骤3
// === 在模板类里 执行步骤 5

