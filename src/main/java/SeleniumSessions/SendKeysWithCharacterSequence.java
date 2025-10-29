package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharacterSequence {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String username="Testuser";
		String Username1="AdminUser";
		System.out.println(username.length());
		
		driver.findElement(By.id("email")).sendKeys(username," ",Username1," super user");
		
		String hostname="https://www.facebook.com";
		String port="8080";
		String param="/index.html";
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(hostname," ",port," ", param);
		
		

	}

}
