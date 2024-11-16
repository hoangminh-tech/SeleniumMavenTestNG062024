package minh.com.Package_demo.package_01;


import org.testng.annotations.Test;

public class DemoTestNG_Package1a {
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
