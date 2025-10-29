package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyswithDisableTextFields {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		driver.findElement(By.id("fname")).sendKeys("AdminUser");
		
		//driver.findElement(By.id("pass")).sendKeys("Testuser");//ElementNotInteractableException: element not interactable
		
		driver.findElement(By.id("pass")).click();

	}

}
