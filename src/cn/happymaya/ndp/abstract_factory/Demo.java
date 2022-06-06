package cn.happymaya.ndp.abstract_factory;

import cn.happymaya.ndp.abstract_factory.app.Application;
import cn.happymaya.ndp.abstract_factory.factories.IGUIFactory;
import cn.happymaya.ndp.abstract_factory.factories.impl.MacOSFactory;
import cn.happymaya.ndp.abstract_factory.factories.impl.WindowsFactory;


/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        IGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
