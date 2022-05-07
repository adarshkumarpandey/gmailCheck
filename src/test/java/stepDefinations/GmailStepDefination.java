package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;
import pageObjects.Logout;
import pageObjects.Search;
import resources.Base;
import resources.ScreenCaptureUtil;

public class GmailStepDefination extends Base {

	Login login;
	Search search;
	Logout logout;

	@AfterStep
	public void as(Scenario scenario) throws IOException {
		scenario.attach(ScreenCaptureUtil.getByteScreenShot(), "image/png", "ScreenShot");
	}

	@Given("navigate to Gmail page")
	public void navigate_to_gmail_page() throws IOException {

		login = new Login();
		driver = login.getDriver();
		System.out.println("Google");

		String Url = login.getUrl();
		driver.get(Url);

	}

	@When("user logged in using username as {string} and password as {string}")
	public void user_logged_in_using_username_as_and_password_as(String email, String password)
			throws InterruptedException {
		login.getEmailBox().sendKeys(email);

		login.getNextToPassword().click();
		Thread.sleep(1500);
		login.getPasswordBox().sendKeys(password);
		login.getNextToLogin().click();

	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(1500);
		System.out.println("Successfully logedIn");
		login.noThanks().click();
	}

	@Given("User is able to open gmail")
	public void user_is_able_to_open_gmail() throws InterruptedException {

		search = new Search();
	}

	@When("user search {string} in the search box")
	public void user_search_in_the_search_box(String key) throws InterruptedException, IOException {

		WebElement wb = search.getSearchBox();
		Actions action = new Actions(driver);
		action.moveToElement(wb).click().moveToElement(wb).sendKeys(key, Keys.ENTER).build().perform();

	}

	@And("Relevent mail should be displayed")
	public void relevent_mail_should_be_displayed() {

		System.out.println("Screenshot taken");

	}

	@And("User should able to open the mail")
	public void user_should_able_to_open_the_mail() throws InterruptedException {
		Thread.sleep(1500);
		search.getEmailPosition().click();

	}

	@Then("User should able to logout successfully")
	public void user_should_able_to_logout_successfully() throws InterruptedException {

		logout = new Logout();
		Thread.sleep(1500);
		logout.getLogoClick().click();
		System.out.println("Driver before = " + driver);
		Thread.sleep(1500);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[3]/iframe")));
		Thread.sleep(1500);
		logout.getSignOut().click();
		System.out.println("Driver After = " + driver);
	}

}
