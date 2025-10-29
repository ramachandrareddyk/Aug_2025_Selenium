package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitConcept {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		String browsername="chrome";
		
		driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		
		driver.get("https://facebook.com");
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
		
		//driver.close();// it will close only browser not session id and it will close only current browser
		
		driver.quit();// it will close browser and session id as well and it will close all the browsers
		
		driver.getTitle();// org.openqa.selenium.NoSuchSessionException
	}

}
