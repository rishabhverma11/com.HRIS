package Keyword;

import org.openqa.selenium.WebDriver;

import HRIS.com.HRIS.Base;

public class CloseBrowser extends Base{
	public CloseBrowser(WebDriver driver) {
		this.driver = driver;
	}
	public void action() {
		driver.close();
	} 

}
