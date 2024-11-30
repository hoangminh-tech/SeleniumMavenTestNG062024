package minh.com.Bai10_Annotation;

import org.testng.annotations.*;

public class DemoAnnotations {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeGroups(groups = {"testOne"})
    public void beforeGroupOne() {
        System.out.println("Before Group testOne 1");
    }

    @AfterGroups(groups = {"testOne"})
    public void afterGroupOne() {
        System.out.println("After Group testOne 1");
    }

    @BeforeGroups(groups = {"testTwo"})
    public void beforeGroupTwo() {
        System.out.println("Before Group testTwo 2");
    }

    @AfterGroups(groups = {"testTwo"})
    public void afterGroupTwo() {
        System.out.println("After Group testTwo 2");
    }



    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(groups = {"testOne"}, priority = 1, description = "Đây là test case thứ 1")
    public void testOneMethod_A() {
        System.out.println("Test method 1a");
    }

    @Test(groups = {"testTwo"}, priority = 2)
    public void testTwoMethod_A() {
        System.out.println("Test method 2a");
    }

    @Test(groups = {"testOne"}, priority = 1, description = "Đây là test case thứ 1b")
    public void testOneMethod_B() {
        System.out.println("Test method 1b");
    }

    @Test(groups = {"testTwo"}, priority = 2)
    public void testTwoMethod_B() {
        System.out.println("Test method 2b");
    }
}
