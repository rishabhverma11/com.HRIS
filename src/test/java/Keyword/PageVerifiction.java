package Keyword;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import HRIS.com.HRIS.Base;

public class PageVerifiction extends Base {
	public PageVerifiction(WebDriver driver) {
	this.driver =driver;
	} 
	public void openbrowser() {
		driver.get("https://hris.qainfotech.com/login.php");
		String pagetitle = driver.getTitle();
		System.out.println(driver);

		Assert.assertEquals("HRIS Login", pagetitle);
		System.out.println("PAge Verified");
		}
		
}
