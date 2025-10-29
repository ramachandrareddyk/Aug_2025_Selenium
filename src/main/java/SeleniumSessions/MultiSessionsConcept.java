package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSessionsConcept {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();//123
		
		//driver= new ChromeDriver();//456
		//driver= new FirefoxDriver();//789
		
		driver.get("https://www.google.com");//123
		
		
		
		System.out.println(driver.getTitle());//123
		
		
		driver.quit();//123
		
		
		driver=new ChromeDriver();//456
		driver.get("https://www.facebook.com");//456
		System.out.println(driver.getTitle());//456
	}

}
