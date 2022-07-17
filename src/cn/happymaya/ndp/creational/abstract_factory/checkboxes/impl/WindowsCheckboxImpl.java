package cn.happymaya.ndp.creational.abstract_factory.checkboxes.impl;

import cn.happymaya.ndp.creational.abstract_factory.checkboxes.ICheckbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckboxImpl implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox...");
    }
}
