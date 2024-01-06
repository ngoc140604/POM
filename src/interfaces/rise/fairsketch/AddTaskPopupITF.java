package interfaces.rise.fairsketch;

public class AddTaskPopupITF{

    public static final String txbTitle ="//input[@id='title']";
    public static final String txbDescription ="//textarea[@name='description']";
    public static final String drdRelatedTo ="//div[@id='s2id_task-context']";
    public static final String ipRelatedTo ="//div[@id='select2-drop']//div[text()='Client']";

    public static final String drdClient ="//div[@id='s2id_client_id']";
    //div[@id='select2-drop']//div[text()='Halvorson Inc']
    public static final String ipClient ="//div[@id='select2-drop']//following::div[text()='Halvorson Inc']";

    public static final String drdPoints ="//div[@id='s2id_autogen18']";
    public static final String ipPoints ="//div[@id='select2-drop']//div[text()='3 Points']";
//    public static final String drdMilesStone ="//div[@id='s2id_milestone_id']//input";
    public static final String drdAssignTo ="//div[@id='s2id_assigned_to']";
    public static final String ipAssignTo ="//div[@id='select2-drop']//div[text()='John Doe']";
//    public static final String drdCollaborators ="//div[@id='s2id_collaborators']";
//    //div[@id='select2-drop']//div[text()='Mark Thomas']
    public static final String ipCollaborators ="//div[@id='s2id_collaborators']//li//input";
    public static final String drdStatus ="//div[@id='s2id_task_status_id']//input";
    public static final String drdPriority ="//div[@id='s2id_project_labels']//input";
    public static final String drdLabels ="//div[@id='s2id_project_labels']//input";
    public static final String txbStartDate ="//input[@id='start_date']";
    public static final String txbDeadline ="//button[@type='submit']";
    public static final String btnSubmit ="//button[@type='submit']";







}
