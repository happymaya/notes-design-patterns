package cn.happymaya.ndp.abstract_factory.factories;

import cn.happymaya.ndp.abstract_factory.buttons.IButton;
import cn.happymaya.ndp.abstract_factory.checkboxes.ICheckbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface IGUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
