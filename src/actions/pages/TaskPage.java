package actions.pages;

import actions.commoms.AbstractPagee;
import interfaces.rise.fairsketch.TaskPageITF;
import org.openqa.selenium.WebDriver;

public class TaskPage extends AbstractPagee {
    WebDriver driver;
    public TaskPage( WebDriver driver) {
        this.driver = driver;
    }
    public AddTaskPopup clickBtnAddTaskPopup(){
        clickToElement(driver, TaskPageITF.btnAddTaskPopup);
        return new AddTaskPopup(driver);

    }
    public void searchTask(){
        waitForElementVisible(driver,TaskPageITF.btnSearch);
        handleDropdown2(driver,TaskPageITF.btnSearch,"Ngoc123");
    }
    public void clickOnTask(){
        waitForElementVisible(driver,TaskPageITF.btnInfoTask);
        clickToElement(driver,TaskPageITF.btnInfoTask);
    }
    public void clickOnEditTask(){
        waitForElementVisible(driver,TaskPageITF.btnEditTask);
        clickToElement(driver,TaskPageITF.btnEditTask);
    }
    public void addComment(String value){
        waitForElementVisible(driver,TaskPageITF.txtComment);
        sendKeyToElement(driver,TaskPageITF.txtComment,value);
        clickToElement(driver,TaskPageITF.btnPostComment);
    }





}

