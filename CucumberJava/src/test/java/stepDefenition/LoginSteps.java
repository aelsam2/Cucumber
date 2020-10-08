package stepDefenition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.PropertyFile;
import io.cucumber.java.en.*;
import master.WebDrive;
import pageObjectModel.LoginPage;


public class LoginSteps {
	WebDrive webDrive=new WebDrive();
	PropertyFile prop = new PropertyFile();
	WebDriver driver;
	LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
		
		String url= prop.url2();
		driver=webDrive.com(url);
		
	}

	@When("^user enters (.*) as username and (.*) as password$")
	public void user_enters_username_and_password(String username, String password) {
		login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.clickLoginBtn();
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.getPageSource().contains("TestProject Example page");
		driver.quit();
		
	}


}
