package cn.happymaya.ndp.creational.abstract_factory.factories.impl;

import cn.happymaya.ndp.creational.abstract_factory.buttons.IButton;
import cn.happymaya.ndp.creational.abstract_factory.buttons.impl.WindowsButtonImpl;
import cn.happymaya.ndp.creational.abstract_factory.checkboxes.ICheckbox;
import cn.happymaya.ndp.creational.abstract_factory.checkboxes.impl.WindowsCheckboxImpl;
import cn.happymaya.ndp.creational.abstract_factory.factories.IGUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButtonImpl();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckboxImpl();
    }
}
