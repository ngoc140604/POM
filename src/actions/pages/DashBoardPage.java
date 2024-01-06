package actions.pages;

import actions.commoms.AbstractPagee;
import interfaces.rise.fairsketch.DashBoardITF;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashBoardPage extends AbstractPagee {
    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashBoardIsDisplayed(String ExpectedTitle){
        System.out.println("Step 6: Verify DashBoard Title");
        Assert.assertTrue(verifyPageTitle(driver,ExpectedTitle),"Không phải trang dashboard");
    }
    public TaskPage clickAddTaskMenu(){
        System.out.println("Step 7: Click add task menu");
        clickToElement(driver, DashBoardITF.taskMenu);
        return new TaskPage(driver);

    }

}
