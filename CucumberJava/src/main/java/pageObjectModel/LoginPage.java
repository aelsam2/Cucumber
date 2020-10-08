package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement userName_field;
	
	@FindBy(id="password")
	WebElement password_field;
	
	@FindBy(id="login")
	WebElement login_btn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		userName_field.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_field.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		login_btn.click();
	}
	

}
