package scandiweb.uitest;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import scandiweb.core.initializer.SystemPropertyInitializer;
import scandiweb.core.ui.browser.Browser;

public abstract class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public void initSuite(ITestContext context) {
        SystemPropertyInitializer.initProperties(context);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Browser.getBrowser().close();
    }
}
