package cn.happymaya.ndp.abstract_factory.app;

import cn.happymaya.ndp.abstract_factory.buttons.IButton;
import cn.happymaya.ndp.abstract_factory.checkboxes.ICheckbox;
import cn.happymaya.ndp.abstract_factory.factories.IGUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private IButton button;
    private ICheckbox checkbox;

    public Application(IGUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
