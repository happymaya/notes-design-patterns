package cn.happymaya.ndp.abstract_factory.checkboxes.impl;

import cn.happymaya.ndp.abstract_factory.checkboxes.ICheckbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckboxImpl implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox...");
    }
}
