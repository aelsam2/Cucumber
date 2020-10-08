package stepDefenition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import config.PropertyFile;
import io.cucumber.java.en.*;
import master.WebDrive;


public class GoogleSearchTest {
	WebDrive webDrive =new WebDrive();
	WebDriver driver;
	
	PropertyFile prop = new PropertyFile();
	
	@Given("user is on google search page")
	public void browser_is_open() throws IOException {
		String url=prop.url1();
		driver = webDrive.com(url);	
	   
	}

	@When("user enters keyword")
	public void user_enters_keyword() {
		driver.findElement(By.name("q")).sendKeys("aelsam");
	   
	}

	@And("click search icon")
	public void click_search_icon() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user is redirected to search result page")
	public void user_is_redirected_to_search_result_page() {
	   driver.getPageSource().contains("Aelsam");
	   driver.close();
	   driver.quit();
	}

}
