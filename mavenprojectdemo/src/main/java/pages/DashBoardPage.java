package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//*[@class='button-blue']")
	private WebElement getstartedbutton;
	
	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement searchfield;
	
	@FindBy(xpath = "(//*[@class='button-outline button-blue'])[2]")
	private WebElement buysharebutton;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement buybutton;
	
	public DashBoardPage(WebDriver driver) throws IOException {
		this.driver = driver;
		wait = new WebDriverWait(driver, 50);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void searchShare()
	{
		wait.until(ExpectedConditions.elementToBeClickable(getstartedbutton));
		getstartedbutton.click();
	}
}
























