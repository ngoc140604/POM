package actions.commoms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class AbstractPage {
    //Web browser
    public void openUrl(WebDriver driver, String url){
        driver.get(url);
    }
    public String getTitle(WebDriver driver){
        return driver.getTitle();
    }
    public String getCurrentUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }
    public String getPageSource(WebDriver driver){
        return driver.getPageSource();
    }

    public void back(WebDriver driver){
        driver.navigate().back();
    }
    public void forward(WebDriver driver){
        driver.navigate().forward();
    }
    public void refresh(WebDriver driver){
        driver.navigate().refresh();
    }

    public WebElement findAnElement(WebDriver driver, String locator){
        return driver.findElement(By.xpath(locator));
    }
    public List<WebElement> findElements(WebDriver driver, String locator){
        return driver.findElements(By.xpath(locator));
    }
    //Web element
    public void clickToElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        waitForElementVisible(driver,locator);
        element.click();
    }
    public void sendKeyToElement(WebDriver driver,String locator,String value){
        WebElement element = findAnElement(driver,locator);
        waitForElementVisible(driver,locator);
        element.sendKeys(value);
    }
    public void selectItemInComboboxByText(WebDriver driver,String locator,String value ){
        WebElement element = findAnElement(driver,locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectItemInComboboxByValue(WebDriver driver,String locator,String value ){
        WebElement element = findAnElement(driver,locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectItemInComboboxByIndex(WebDriver driver,String locator,int index ){
        WebElement element = findAnElement(driver,locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void scrollToElement(WebDriver driver, String locator){
        WebElement element = findAnElement(driver,locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

    public void waitForElementVisible(WebDriver driver,String locator){
        WebElement element =findAnElement(driver,locator);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void waitForElementInvisible(WebDriver driver,String locator){
        By xpath = By.xpath(locator);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));

    }
    public void waitForElementClickable(WebDriver driver,String locator){
        WebElement element =findAnElement(driver,locator);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementPresence(WebDriver driver,String locator){
        By xpath = By.xpath(locator);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath));

    }
    public void dragAndDropElement(WebDriver driver, String source , String destination){
        WebElement elementSource = findAnElement(driver,source);
        WebElement elementDestination = findAnElement(driver,destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementSource,elementDestination);


    }
    public void hoverElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }
    public void checkToCheckBox(WebDriver driver,String locator) {
        WebElement element = findAnElement(driver, locator);
        if (!element.isSelected()) {
            element.click();

        }
    }

    public void unCheckToCheckBox(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        if (element.isSelected()) {
            element.click();


        }
    }
    public String getAttributeValue(WebDriver driver,String locator,String attributeValue){
        WebElement element = findAnElement(driver, locator);
        return element.getAttribute(attributeValue);
    }
    public String getTextElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        return element.getText();
    }

    public void switchToWindowBytittle(WebDriver driver,String tittle){
        Set<String> allWindows = driver.getWindowHandles();
        for(String runWindowsL: allWindows){
            driver.switchTo().window(runWindowsL);
            String currentWindow = driver.getTitle();
            if(currentWindow.equals(tittle)){
                break;
            }
        }
    }
    public void ClearValueInToElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        element.clear();
    }
    public String getPageTitle(WebDriver driver) {
        String title =getTitle(driver);
        return title;
    }

    public boolean verifyPageTitle(WebDriver driver,String pageTitle) {
        return getPageTitle(driver).contains(pageTitle);
    }

    public void handleDropdown(WebDriver driver,String locator1, String locator2){
        clickToElement(driver, locator1);
        clickToElement(driver,locator2);

    }
    public void handleDropdown2(WebDriver driver,String locator,String value){
        WebElement element =findAnElement(driver,locator);
        Actions action = new Actions(driver);
        action.sendKeys(element, value).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();

    }
    public boolean verifyElementIsVisible(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        return element.isDisplayed();
    }
    public void handleAlert(WebDriver driver){
        driver.switchTo().alert().accept();
    }


}
