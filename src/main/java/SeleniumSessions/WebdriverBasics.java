package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
	
	
	//1. Open the browser
	//2. launch the url
	//3. verify the page title

	public static void main(String[] args) {
		
		//WebDriver driver= new WebDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Training Workspace\\Aug_2025_Selenium_Sessions\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("Correct page title--Pass");
		}else {
			System.out.println("Incorrect page title--FAIL");
		}
		
		driver.quit();

	}

}
