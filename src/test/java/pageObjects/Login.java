package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class Login extends Base {

	//WebDriver driver;
	By email = By.xpath("//*[@type = 'email']");
	By nextToPassword = By.xpath("//*[@class = 'VfPpkd-vQzf8d']");
	By password = By.xpath("//input[@type = 'password']");
	By nextToLogin = By.xpath("//*[@class = 'VfPpkd-vQzf8d']");
	By noThanks = By.xpath("//button[@class = 'by7 T-I']");
	

	public Login() throws IOException {
		driver = InitializeDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailBox() {

		return driver.findElement(email);
	}

	public WebElement getNextToPassword() {

		return driver.findElement(nextToPassword);
	}

	public WebElement getPasswordBox() {

		return driver.findElement(password);
	}

	public WebElement getNextToLogin() {

		return driver.findElement(nextToLogin);
	}
	
	public WebElement noThanks() {

		return driver.findElement(noThanks);
	}



}
