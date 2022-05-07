package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Search extends Base{
	
	
	By searchBox = By.xpath("//form[@class = 'gb_Te gb_rf' and @role = 'search']");
	By emailPos = By.xpath("//*[@jslog = '18406; u014N:xr6bB,cOuCgd,SYhH9d; 41:W251bGwsbnVsbCxudWxsLG51bGwsW251bGwsIkZNZmNnekdwRnFQV0JtbndxREdLd0tHWnB0TGJKR0twIiwxXV0.']");
	
	
	public Search() {}
	
	public WebElement getSearchBox() {

		return driver.findElement(searchBox);
	}
	
	public WebElement getEmailPosition()
	{
		return driver.findElement(emailPos);
	}
	
	

}
