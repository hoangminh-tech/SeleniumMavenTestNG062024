package minh.com.bai9TestNG_Framework1;


import org.testng.annotations.Test;

public class DemoTestNG_02 {
    @Test
    public void TestLoginCRM()
    {
        System.out.println("Test Login successfully");
    }
    @Test
    public void testCreateCustomer(){
        System.out.println("Test Add new Customer CRM");
    }

    @Test
    public void testEditCustomer(){
        System.out.println("Text edit Customer CRM");
    }
}
