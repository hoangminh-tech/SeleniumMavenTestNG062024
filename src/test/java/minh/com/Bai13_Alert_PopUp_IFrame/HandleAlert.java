package minh.com.Bai13_Alert_PopUp_IFrame;

import minh.com.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class HandleAlert extends BaseTest {
    @Test
    public void demoHandleAlertAccept() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);

        //Mở Alert Message, click vào nút "Click me!" thứ nhất
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(2000);

        //Khởi tạo class Alert thứ nhất
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        Thread.sleep(2000);
    }


    @Test
    public void demoHandleAlertDismiss() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);

        //Scroll to element
        WebElement element = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Mở Alert Message, click vào nút "Click me!" thứ nhất
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(2000);

        //Khởi tạo class Alert
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@id='confirmResult']")).isDisplayed(),
                "Chưa nhấn được nút Cancel");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText(),
                "You selected Cancel","The message content not found");


        Thread.sleep(2000);
    }
    @Test
    public void demoHandleInputText() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);

        //Scroll to element
        WebElement element = driver.findElement(By.xpath("//button[@id='promtButton']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Mở Alert Message, click vào nút "Click me!" thứ nhất
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);

        //Khởi tạo class Alert
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys("Selenium");
        Thread.sleep(1000);
        alert3.accept();

        Assert.assertTrue(driver.findElement(By.xpath("//span[@id='promptResult']")).isDisplayed(),
                "Chưa nhấn được nút Cancel");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='promptResult']")).getText(),
                "You entered Selenium","The message content not found");


        Thread.sleep(2000);
    }
}
