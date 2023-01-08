package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	@BeforeClass
	public void init() {
		hp = PageFactory.initElements(driver, HomePage.class);
	}
	
	
	@Test
	public void verifyAddToCart() {
		String actualCount = hp.addToCart();
		System.out.println("Actual Count---->"+actualCount);
		Assert.assertEquals(actualCount, "1");
		
	}

}
