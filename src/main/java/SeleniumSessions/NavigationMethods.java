package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
//		
		System.out.println(driver.getTitle());//google
//		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());//facebook
		Thread.sleep(4000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		Thread.sleep(4000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());//facebook
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		
	}

}
