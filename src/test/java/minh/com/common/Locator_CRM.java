package minh.com.common;

public class Locator_CRM {
    //login page
    public static String HeaderLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String ButtonLogin = "//button[normalize-space()='Login']";
    public static String CheckboxRememberMe = "//input[@id=''remember]";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String AlertErrorMassage = "//div[@id='alerts']/div";

    //Dashboard Page
    public static String MenuDashboard = "//span[normalize-space()='Dashboard']";
    public static String MenuCustomer = "//span[normalize-space()='Customers']";
    public static String iconProfile = "//span[normalize-space()='Customers']";
    public static String MenuTask = "//span[normalize-space()='Tasks']";
    public static String ButtonNewTask ="//a[normalize-space()='New Task']";
    public static String menuSale = "//span[@class='menu-text' and normalize-space()='Sales']";
    public static String menuProposals = "//span[normalize-space()='Proposals']";

    public static String totalInvoicesAwaitingPayment = "(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span";
    public static String totalProjectsInProgress = "(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span";

    //Customer Page
    public static String HeaderCustomerPage = "//span[normalize-space()='Customers']";
    public static String ButtonAddNewCustomers = "//a[normalize-space()='New Customer']";
    public static String BtnImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String SearchCustomer = "//div[@id='clients_filter']//input[@type='search']";
    public static String InputCompany = "//input[@id='company']";
    public static String InputVAT = "//input[@id='vat']";
    public static String InputPhone = "//input[@id='phonenumber']";
    public static String InputWebsite = "//input[@id='website']";
    public static String DropDownGroup = "//button[@data-id=\"groups_in[]\"]";
    public static String InputSearchGroup = "//button[@data-id=\"groups_in[]\"]//following-sibling::div//input";
    public static String InputVIP = "//span[normalize-space()='VIP']";
    public static String DropDownLanguage = "//button[@data-id='default_language']";
    public static String itemVietNamese = "//span[normalize-space()='Vietnamese']";
    public static String InputAddress = "//textarea[@id='address']";
    public static String InputCity = "//input[@id='city']";
    public static String InputState = "//input[@id='state']";
    public static String DropDownCountry = "//button[@data-id='country']";
    public static String InputSearchCountry = "//button[@data-id='country']/following-sibling::div//input";
    public static String InputVietnam = "//button[@data-id='country']/following-sibling::div//span[normalize-space()='Vietnam']";
    public static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";
    public static String InputZip = "//input[@id='zip']";
    public static String itemCustomerfirst = "//table[@id='clients']/tbody/tr[1]/td[3]/a";


    public static String buttonNewProposal = "//a[normalize-space()='New Proposal']";

}
