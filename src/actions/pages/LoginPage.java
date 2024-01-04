package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.guru99Bank.LoginPageInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(By.xpath(LoginPageInterface.HERE_LINK));
    }
    public void inputUserIdAndPassword(String user, String password){
        sendKeyToElement(driver, LoginPageInterface.TXB_USER, user);
        sendKeyToElement(driver, LoginPageInterface.TXB_PASSWORD, password);
//		driver.findElement(By.xpath(LoginPageInterface.TXB_USER)).sendKeys(user);
//		driver.findElement(By.xpath(LoginPageInterface.TXB_PASSWORD)).sendKeys(password);
    }

    public void clickLogin(){
        clickToElement(driver, LoginPageInterface.BTN_LOGIN);
//		driver.findElement(By.xpath(LoginPageInterface.BTN_LOGIN)).click();
    }

}
