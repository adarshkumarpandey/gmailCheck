package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {

	}

	public Base(WebDriver driver) {
		Base.driver = driver;
	}

	public WebDriver InitializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ADARSPAN\\eclipse-workspace\\GmailCheck\\src\\test\\java\\resources\\data.properties");

		prop.load(fis);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADARSPAN\\Desktop\\Training\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public String getUrl() {

		return prop.getProperty("url");
	}

}
