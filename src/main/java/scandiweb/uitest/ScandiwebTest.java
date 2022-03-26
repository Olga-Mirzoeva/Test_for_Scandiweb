package scandiweb.uitest;

import org.testng.Assert;
import org.testng.annotations.Test;
import scandiweb.page.LoginPage;

public class ScandiwebTest extends BaseTest {
    @Test(testName = "testScandiweb",
            description = "testScandiweb - Test to check the work of site Scandiweb")
    public void testAlibaba() {
        final String nameSearch = "Rich Plum Roses";
        final String expectedCorrectTitle = "Rich Plum Roses - Set of Six";

        LoginPage loginPage = new LoginPage();
        loginPage.open()
                .clickSearch()
        .typeSearch(nameSearch)
                .clickSearchCorrect();
        String actualCorrectTitle = loginPage.getTextCorrectTitle();
        Assert.assertEquals(actualCorrectTitle, expectedCorrectTitle, "Verify correct title");
    }
}
