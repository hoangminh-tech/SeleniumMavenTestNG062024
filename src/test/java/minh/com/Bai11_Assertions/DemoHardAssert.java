package minh.com.Bai11_Assertions;

import minh.com.common.BaseTest;
import minh.com.common.Locator_CRM;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoHardAssert extends BaseTest {
    @Test
    public void TestLoginSuccess() {


        driver.get("https://crm.anhtester.com/admin/authentication");

        //Kiểm tra giá trị header hoặc đối tượng Header
        Assert.assertTrue(driver.findElement(By.xpath(Locator_CRM.HeaderLogin)).isDisplayed(),"Giá trị header không hiển thị");
        Assert.assertEquals(driver.findElement(By.xpath(Locator_CRM.HeaderLogin)).getText(),"Login","Giá trị header không đúng");


        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath(Locator_CRM.ButtonLogin)).click();
        Assert.assertTrue(driver.findElement(By.xpath(Locator_CRM.MenuDashboard)).isDisplayed(),"menu dashboard không hiển thị");
        Assert.assertEquals(driver.findElement(By.xpath(Locator_CRM.MenuDashboard)).getText(),"Dashboard","Giá trị Dashboard không như mong đợi");
        Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Invoices Awaiting Payment']")).getText().contains("Invoices Awaiting1"));
    }
}
