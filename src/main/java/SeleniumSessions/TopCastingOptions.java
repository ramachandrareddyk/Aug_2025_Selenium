package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {
	
	
	public static void main(String[] args) {
		
		
		//1. Valid but only for chrome driver
		//ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
	
		
		//2. recommended and vlaid
		WebDriver driver= new ChromeDriver();
		
		//driver= new FirefoxDriver();
		
		//3. recommended and vlaid---Remote machine(cloud, AWS, servers, Machine)
		
		//RemoteWebDriver driver= new RemoteWebDriver(remoteAddress, cappabilities)
		
		
		//4 valid but not recommended
		//SearchContext driver= new ChromeDriver();
		
		//5 valid 
		//RemoteWebDriver driver= new ChromeDriver();
		//driver= new FirefoxDriver;
		
		//6 valid only for chrome and edge
		//ChromiumDriver driver= new ChromeDriver();
		//driver= new EdgeDriver();
		//driver= new FirefoxDriver();
		
		
		
		
		
		
		
		
		driver.get("https://www.flipkart.com");
		
	}

}
