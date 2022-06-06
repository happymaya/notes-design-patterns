package cn.happymaya.ndp.abstract_factory.factories.impl;

import cn.happymaya.ndp.abstract_factory.buttons.IButton;
import cn.happymaya.ndp.abstract_factory.buttons.impl.MacOSButtonImpl;
import cn.happymaya.ndp.abstract_factory.checkboxes.ICheckbox;
import cn.happymaya.ndp.abstract_factory.checkboxes.impl.MacOSCheckboxImpl;
import cn.happymaya.ndp.abstract_factory.factories.IGUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new MacOSButtonImpl();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckboxImpl();
    }
}
