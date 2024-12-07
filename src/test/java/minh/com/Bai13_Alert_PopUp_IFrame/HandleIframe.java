package minh.com.Bai13_Alert_PopUp_IFrame;

import minh.com.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleIframe extends BaseTest {
    @Test
    public void demoHandleAlertAccept() throws InterruptedException {
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
        // Chuyển hướng đến iFrame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']")));
        System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());

        //chuyển hướng về nội dung chính không thuộc thẻ iframe
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Frames']")).getText());

        Thread.sleep(2000);
    }
}
