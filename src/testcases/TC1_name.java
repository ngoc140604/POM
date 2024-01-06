package testcases;

import actions.commoms.AbstractTest;
import actions.pages.AddTaskPopup;
import actions.pages.DashBoardPage;
import actions.pages.LoginPage;
import actions.pages.TaskPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TC1_name extends AbstractTest {
    private WebDriver driver;
    private DashBoardPage dashBoardPage;
    private TaskPage taskPage;
    private AddTaskPopup addTaskPopup;
    @Parameters({"browser"})
    @BeforeTest
    public void beforeClass(String browser){
       driver = openMultiBrowse(browser);
    }
    @Test(priority = 1)
    public void TC01_LoginIntoDashBoard(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openTheWebsite("https://rise.fairsketch.com/signin");
        loginPage.inputUserIdAndPassword("admin@demo.com","riseDemo");
        dashBoardPage=loginPage.clickLogin();
    }
    @Test(priority = 2)
    public void TC02_OpenAndFillFormAddTask() throws InterruptedException {
        dashBoardPage.verifyDashBoardIsDisplayed("Dashboard | RISE - Ultimate Project Manager and CRM");
        taskPage= dashBoardPage.clickAddTaskMenu();
        addTaskPopup =taskPage.clickBtnAddTaskPopup();
        addTaskPopup.fillAllForm();
        addTaskPopup.ClickDrdRelatedTo();
        addTaskPopup.clickDrdClient();
        addTaskPopup.clickDrdPoints();
        Thread.sleep(2000);
        addTaskPopup.clickAssignTo();
        addTaskPopup.clickCollaborator();
        taskPage = addTaskPopup.clickSave();
        Thread.sleep(2000);


    }
    @Test(priority = 3)
    public void TC03_SearchAndCommentTask() throws InterruptedException {
        taskPage.searchTask();
        taskPage.clickOnTask();
        taskPage.clickOnEditTask();
        taskPage.addComment("Ngu người");

    }


    @AfterTest
    public void after(){
        driver.quit();
    }




}
