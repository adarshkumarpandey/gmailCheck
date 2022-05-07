package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Logout extends Base {

	//By logo = By.xpath("//img[@class = 'gb_zc gb_ma gb_pa']");
	By logo = By.cssSelector(".gb_Aa");
	//By signOut = By.xpath("//*[@class = 'jAcX2 ZWVAt R37Fhd']");
	By signOut = By.cssSelector(".jAcX2 > .wBFtm");
	
     public WebElement getLogoClick() {

		return driver.findElement(logo);
	}

	public WebElement getSignOut() {

		return driver.findElement(signOut);
	}

}
