package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsDisplayed {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		//WebElement loginBtn=driver.findElement(By.name("login"));
		WebElement forgetPass=driver.findElement(By.linkText("Forgotten password?"));
		
		boolean flag= username.isDisplayed();
		if(flag) {
			System.out.println("Username is present in the page");
		}else {
			System.out.println("Username is not present in the page");
		}
		
		
		By loginBtn=By.name("login");
		
		isElementDIsplayed(loginBtn);
		
		if(isElementDIsplayed(loginBtn)) {
			System.out.println("Login BUtton is present in the page");
		}else {
			System.out.println("Login BUtton is not present in the page");
		}
		

	}
	
	public static boolean isElementDIsplayed(By Locater) {
		return getWebElement(Locater).isDisplayed();
	}
	
	
	public static WebElement getWebElement(By locater) {
		return driver.findElement(locater);
	}

}
