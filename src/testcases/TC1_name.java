package testcases;

import actions.commoms.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1_name extends AbstractTest {
    WebDriver driver;
    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser){
       driver = openMutilBrowse(browser);



    }
    @Test
    public void Tc01_CreateAccount(){
        System.out.println("Test");
    }


}
