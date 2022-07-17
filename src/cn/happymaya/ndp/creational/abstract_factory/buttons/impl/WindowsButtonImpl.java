package cn.happymaya.ndp.creational.abstract_factory.buttons.impl;

import cn.happymaya.ndp.creational.abstract_factory.buttons.IButton;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButtonImpl implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton...");
    }
}
