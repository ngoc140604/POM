package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.rise.fairsketch.DashBoardITF;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashBoardPage extends AbstractPage {
    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashBoardIsDisplayed(String ExpectedTitle){
        System.out.println("Step 5: Verify DashBoard Title");
        Assert.assertTrue(verifyPageTitle(driver,ExpectedTitle),"Không phải trang dashboard");
    }
    public SalesPage selectMenu(String menu,String choice){
        System.out.println("Step 6: Click Sales then click invoice");
            clickToElement(driver, String.format(DashBoardITF.TXT_MENU, menu));
            clickToElement(driver,String.format(DashBoardITF.BTN_INVOICES,choice));
            return new SalesPage(driver);



    }

}
