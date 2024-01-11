package testcases;

import actions.commoms.AbstractTest;
import actions.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.HashMap;

public class RunTestCase extends AbstractTest {
    private WebDriver driver;
    private DashBoardPage dashBoardPage;
    private SalesPage salesPage;
    @Parameters({"browser"})
    @BeforeTest
    public void beforeClass(String browser){
        //Khoi tao browser
       driver = openMultiBrowse(browser);
    }
    @Test(dataProvider = "getData",priority = 1)
    public void TC01_LoginIntoDashBoard(HashMap<String,String> input){
        //Khoi tao LoginPage
        LoginPage loginPage = new LoginPage(driver);
        //a:Truy cap https://rise.fairsketch.com
        loginPage.openTheWebsite("https://rise.fairsketch.com/signin");
        //b: Login voi tai khoan admin bang hashMap dung dataProvider
        loginPage.inputUserIdAndPassword(input.get("Email"),input.get("Pass"));
        //Tra ve trang DashBoard sau khi click login
        dashBoardPage=loginPage.clickLogin();
    }
    @Test(priority = 2)
    public void TC02_OpenSalesAndInvoices() throws InterruptedException {
        dashBoardPage.verifyDashBoardIsDisplayed("Dashboard | RISE - Ultimate Project Manager and CRM");
        salesPage = dashBoardPage.selectMenu("Sales","invoices");
        salesPage.clickAddPayment("Add payment");


    }
    @Test(priority = 3)
    public void TC03_InputAllFieldInAddPayMen() throws InterruptedException {
        System.out.println("Add first Payment");
        salesPage.inputAllform();
        Thread.sleep(2000);

    }
    @Test(priority = 4)
    public void TC04_DeletePaymentJustAdd(){
        System.out.println("Step 7: Click Delete");
        salesPage.DeletePayment();



    }




    @AfterTest
    public void after(){
        if(driver!=null){
            System.exit(0);
        }
    }
@DataProvider
    public Object[][] getData(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Email","admin@demo.com");
        map.put("Pass","riseDemo");
        return new Object[][]{{map}
        };
    }




}
