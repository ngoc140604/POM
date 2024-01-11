package actions.pages;

import actions.commoms.AbstractPage;
import interfaces.rise.fairsketch.SaleITF;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SalesPage extends AbstractPage {
    WebDriver driver;

    public SalesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddPayment(String value){
        clickToElement(driver, String.format(SaleITF.BTN_ADDPAYMENT,value));


    }
    public void selectValueInDropdownlist(String dropdown,String value) {
        clickToElement(driver, String.format(SaleITF.DROPDOWN_LIST,dropdown));
        clickToElement(driver, String.format(SaleITF.OPTION,value));
    }
    public void selectValueInCombobox(String value) {
            WebElement element =findAnElement(driver,SaleITF.COMBOBOX);
            Actions action = new Actions(driver);
            action.sendKeys(element, value).build().perform();
            action.sendKeys(Keys.ENTER).build().perform();
    }
    public void selectValueInCombobox2(String value) {
        WebElement element =findAnElement(driver,SaleITF.PAYMENT_DATE);
        Actions action = new Actions(driver);
        action.sendKeys(element, value).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
    }
    public void inputAllform(){
        selectValueInDropdownlist("Invoice","INVOICE #25");
        selectValueInCombobox("CASH");
        selectValueInCombobox2("11/01/2024");
        sendKeyToElement(driver,SaleITF.AMOUNT,"20");
        sendKeyToElement(driver,SaleITF.TXB_NOTE,"Ok");
        clickToElement(driver,SaleITF.BTN_SUBMIT);
        waitForElementVisible(driver,String.format(SaleITF.BTN_ADDPAYMENT,"Add payment"));
    }
    public void DeletePayment(){
        clickToElement(driver,SaleITF.BTN_DELETE);
        //a[@title='Delete invoice']
        clickToElement(driver,SaleITF.DELETE);
        handleAlert(driver);

    }




}
