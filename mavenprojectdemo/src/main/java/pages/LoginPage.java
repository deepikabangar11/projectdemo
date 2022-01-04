package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		wait= new WebDriverWait(driver, 50);
		PageFactory.initElements(driver,this);
	}

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath ="//*[@id='userid']")
	private WebElement username;
	

	@FindBy(xpath ="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']" )
	private WebElement submit;
	
	@FindBy(xpath ="//*[@id='pin']")
	private WebElement pin;
	
	
	public void loginWithCredentials()
	{
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("password"));
		submit.click();
	}
	
	public void enterPin(){
		pin.sendKeys(prop.getProperty("pin"));
		submit.click();
	}
	
	public boolean verifyUrl() {
		String url = driver.getCurrentUrl();
		if(url.contains("dashboard"))
		{
			return true;
		}
		else {
			return false;
		}
	}

}






























