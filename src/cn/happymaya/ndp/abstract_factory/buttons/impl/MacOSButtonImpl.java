package cn.happymaya.ndp.abstract_factory.buttons.impl;

import cn.happymaya.ndp.abstract_factory.buttons.IButton;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a macOS variant of a button.
 */
public class MacOSButtonImpl implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton...");
    }
}
