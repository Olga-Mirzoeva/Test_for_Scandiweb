package scandiweb.page;

import scandiweb.core.initializer.SystemProperties;
import scandiweb.core.ui.browser.Browser;
import scandiweb.core.ui.element.Button;
import scandiweb.core.ui.element.Input;
import scandiweb.core.ui.element.Text;

import static scandiweb.core.ui.element.LocatorType.XPATH;

public class LoginPage extends BasePage {
    //LOCATORS
    private static final String SEARCH_INPUT_XPATH = "//*[@id='search-field']";
    private static final String SEARCH_CORRECT_BUTTON_XPATH = "//*[@class='SearchOverlay-Content']" +
            "//*[text()='Rich Plum Roses - Set of Six']";
    private static final String CORRECT_TITLE_TEXT_XPATH = "//*[@class='ProductActions-Title']";

    //ELEMENTS
    private Button searchButton = new Button(SEARCH_INPUT_XPATH, XPATH);
    private Input searchInput = new Input(SEARCH_INPUT_XPATH, XPATH);
    private Button searchCorrectButton = new Button(SEARCH_CORRECT_BUTTON_XPATH, XPATH);
    private Text correctTitleText = new Text(CORRECT_TITLE_TEXT_XPATH, XPATH);

    public LoginPage() {
        super();
    }

    public LoginPage open() {
        Browser.getBrowser().open(System.getProperty(SystemProperties.URL.getSystemName()));
        return new LoginPage();
    }

    public LoginPage clickSearch() {
        searchButton.click();
        return this;
    }


    public LoginPage typeSearch(String nameSearch) {
        searchInput.type(nameSearch);
        return this;
    }

    public LoginPage clickSearchCorrect() {
        searchCorrectButton.click();
        return new LoginPage();
    }


    public String getTextCorrectTitle() {
        return correctTitleText.getText();
    }
}
