package interfaces.rise.fairsketch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPageITF {
//
    public static final String btnAddTaskPopup ="//a[@class='btn btn-default'][normalize-space()='Add task']";
    public static final String btnSearch ="//div[@id='task-table_filter']//input";
    public static final String btnInfoTask ="//table[@id='task-table']//following::a[text()='Ngoc123']";
    //div[@class='modal-footer']//a[@title='Edit task']
    public static final String btnEditTask="//h4[@id='ajaxModalTitle']//a";
    public static final String txtComment="//textarea[@id='comment_description']";
    //div[@id='task-dropzone']//button[text()=' Post Comment']
    public static final String btnPostComment="//div[@id='task-dropzone']//button[text()=' Post Comment']";

}
