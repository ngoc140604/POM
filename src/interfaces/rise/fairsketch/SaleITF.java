package interfaces.rise.fairsketch;

public class SaleITF {
    //a[contains(@href,'invoices')]
    public static final String BTN_ADDPAYMENT ="//a[@class='btn btn-default mb0'][normalize-space()='%s']";
    public static final String DROPDOWN_LIST="//label[@for='invoice_id']//following-sibling::div/div[@title='%s']";
    public static final String OPTION="//div[@id='select2-drop']//following::div[text()='%s']";
    //s2id_autogen10
    public static final String COMBOBOX="//label[text()='Payment method']//following-sibling::div//div[@id='s2id_autogen10']//input";
    public static final String PAYMENT_DATE="//label[text()='Payment date']/following-sibling::div/input";
    //label[text()='Payment date']/following-sibling::div/input
    //input[@id='invoice_payment_amount']
    public static final String AMOUNT="//input[@id='invoice_payment_amount']";
    //div[@role='textbox']
     public static final String TXB_NOTE="//label[@for='invoice_payment_note']//following-sibling::div/textarea";
    //button[normalize-space()='Save']
    public static final String BTN_SUBMIT="//button[normalize-space()='Save']";
    //tbody/tr[2]/td[10]/span[1]/button[1]
    public static final String BTN_DELETE="//tbody/tr[2]/td[10]/span[1]/button[1]";
    //a[@title='Delete invoice']
    public static final String DELETE="//a[@title='Delete invoice']";
}
