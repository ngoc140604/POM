package actions.pages;

import actions.commoms.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed(){

    }
}
