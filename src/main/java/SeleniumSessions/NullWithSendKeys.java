package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys(null); IllegalArgumentException:
		
		String uname=null;
		//System.out.println(uname.length());//nullpointerException
		String username="";
		System.out.println(username.length());
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		

	}

}
