package actions.pages;

import actions.commoms.AbstractPagee;
import interfaces.rise.fairsketch.LoginPageITF;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPagee {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openTheWebsite(String url){
        System.out.println("Step 1:Open the Website ");
        openUrl(driver,url);

    }


    public void inputUserIdAndPassword(String user, String password){
        ClearValueInToElement(driver,LoginPageITF.txbEmail);
        System.out.println("Step 2: Input UserName");
        sendKeyToElement(driver, LoginPageITF.txbEmail,user);
        System.out.println("Step 3: Input PassWord");
        ClearValueInToElement(driver,LoginPageITF.txbPassWord);
        sendKeyToElement(driver, LoginPageITF.txbPassWord, password);

    }

    public DashBoardPage clickLogin(){
        clickToElement(driver, LoginPageITF.btnSubmit);
        System.out.println("Click submit button");
        return new DashBoardPage(driver);


    }

}
