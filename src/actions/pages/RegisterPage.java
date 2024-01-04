package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.guru99Bank.RegisterPageInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends AbstractPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
       sendKeyToElement(driver,RegisterPageInterface.TXB_EMAIL,email);
    }
    public void clickSubmit(){
        clickToElement(driver,RegisterPageInterface.BTN_SUBMIT);
    }
    public String getUserInfo(){
        return findAnElement(driver,RegisterPageInterface.INFO_USER).getText();
    }
    public String getPassWord(){
        return findAnElement(driver,RegisterPageInterface.INFO_PASS).getText();
    }
}
