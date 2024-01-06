package actions.pages;

import actions.commoms.AbstractPagee;
import interfaces.rise.fairsketch.AddTaskPopupITF;
import org.openqa.selenium.WebDriver;

public class AddTaskPopup extends AbstractPagee {
    WebDriver driver;

    public AddTaskPopup(WebDriver driver) {
        this.driver=driver;
    }
    public void ClickDrdRelatedTo() throws InterruptedException {
        handleDropdown(driver,AddTaskPopupITF.drdRelatedTo,AddTaskPopupITF.ipRelatedTo);
        Thread.sleep(1000);
    }
    public void clickDrdClient(){
        handleDropdown(driver,AddTaskPopupITF.drdClient,AddTaskPopupITF.ipClient);
    }
    public void clickDrdPoints(){
        handleDropdown(driver,AddTaskPopupITF.drdPoints,AddTaskPopupITF.ipPoints);
    }
    public void clickAssignTo(){
        handleDropdown(driver,AddTaskPopupITF.drdAssignTo,AddTaskPopupITF.ipAssignTo);
    }
    public void clickCollaborator(){
        handleDropdown2(driver,AddTaskPopupITF.ipCollaborators,"John Doe");

    }
    public TaskPage clickSave(){
        clickToElement(driver,AddTaskPopupITF.btnSubmit);
        return new TaskPage(driver);
    }


    public void fillAllForm() throws InterruptedException {

        sendKeyToElement(driver, AddTaskPopupITF.txbTitle,"Ngoc123");
        sendKeyToElement(driver, AddTaskPopupITF.txbDescription,"C1023ATL1");





    }

}
