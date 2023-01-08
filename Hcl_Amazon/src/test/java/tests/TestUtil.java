package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase{
	
   public WebDriverWait wait;
   
   public TestUtil() {
	   wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
   }

	
	public  void waitTime(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
	
	public void webdriverwait(String ele) {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ele))).click();
					
	}
}
