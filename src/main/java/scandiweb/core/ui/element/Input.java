package scandiweb.core.ui.element;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import scandiweb.core.ui.browser.Browser;

public class Input extends BaseElement {
    public Input(String locator, LocatorType locatorType) {
        super(locator, locatorType);
    }

    public void type(String value) {
        WebElement element = Browser.getBrowser().findElement(by);
        LogManager.getLogger().debug(String.format("Type '%s' in input by: %s", value, by));
        element.sendKeys(value);
    }
}
