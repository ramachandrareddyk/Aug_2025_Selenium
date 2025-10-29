package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilities {
	
	WebDriver driver;
	
	public WebDriver initBrowser(String browserName) {
		
		System.out.println("Browser name is :"+browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;
		case "safari":
			driver= new SafariDriver();
			break;	
			
		default:
			System.out.println("Invalid browser name please pass the correct browser name");
			
			throw new BrowserException("=========INVALID BROWSER========");
		}
		
		return driver;
		
		
		
	}
	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public String doGetPageTitle() {
		return driver.getTitle();
	}
	
	public String doGetCurrentPageTitle() {
		return driver.getCurrentUrl();
	}

}
