package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.TestUtil;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	TestUtil testUtil;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement rating;
	
	//@FindBy(xpath="//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Amazon Fire TV')]")
	//WebElement tv;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCartBtn;
	
	@FindBy(id="nav-cart-count")
	WebElement count;
	
	@FindBy(xpath="//span[@class='a-button a-button-base abb-intl-decline']//input[@type='submit']")
	WebElement warrenty;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;	
		testUtil = new TestUtil();
	}
	
	
	public String addToCart() {
		searchBox.sendKeys("television",Keys.ENTER);
		rating.click();
		String tv = "//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Amazon Fire TV')]";
		testUtil.webdriverwait(tv);
		addToCartBtn.click();
		warrenty.click();
		return count.getText();
	}

}
