package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EWSLogin 
{

	@FindBy (xpath ="//img[contains(@src, 'ews-logo.png')]")
	private WebElement EwsLogo;
	
	@FindBy (xpath = "//*[@id='userName']")
	private WebElement Username;
	
	@FindBy (xpath ="//*[@id='Password']")
	private WebElement Password;
	
	
	public EWSLogin()
	{
		
		PageFactory fact = new 
	}
	
}
