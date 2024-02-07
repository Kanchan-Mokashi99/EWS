package configue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowersLaunch 
{

	WebDriver driver;
	
	public WebDriver initbrowser()
	{
		driver = new ChromeDriver();
		
		return driver;
	}
	
	
	public WebDriver returnbrowser()
	{
		
		return driver;
		
	}
	
	
}
