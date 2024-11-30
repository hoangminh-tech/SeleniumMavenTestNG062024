package minh.com.Bai11_Assertions;

import minh.com.common.BaseTest;
import minh.com.common.Locator_CRM;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert extends BaseTest {
    @Test
    public void TestLoginSuccess() {
        SoftAssert softAssert = new SoftAssert();

        driver.get("https://crm.anhtester.com/admin/authentication");

        //Kiểm tra giá trị header hoặc đối tượng Header
        Assert.assertTrue(driver.findElement(By.xpath(Locator_CRM.HeaderLogin)).isDisplayed(),"Giá trị header không hiển thị");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator_CRM.HeaderLogin)).getText(),"Login123","Giá trị header không đúng");


        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath(Locator_CRM.ButtonLogin)).click();
        softAssert.assertTrue(driver.findElement(By.xpath(Locator_CRM.MenuDashboard)).isDisplayed(),"menu dashboard không hiển thị");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator_CRM.MenuDashboard)).getText(),"Dashboard22","Giá trị Dashboard không như mong đợi");
        Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Invoices Awaiting Payment']")).getText().contains("Invoices Awaiting"),"The contains is not found");

        softAssert.assertAll();
    }
}
