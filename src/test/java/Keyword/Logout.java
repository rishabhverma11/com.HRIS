package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

import HRIS.com.HRIS.Base;

public class Logout extends Base {
	WebDriver driver;
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	By logbtnlogo = By.className("user-image");
	
	By clicklog =By.cssSelector("a[href='https://hris.qainfotech.com:8086/user/logoff']");
		        
	public void action()  {
		
		driver.findElement(logbtnlogo).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lgtBtn =driver.findElement(clicklog);
		js.executeScript("arguments[0].click();", lgtBtn);
		
	}

}
