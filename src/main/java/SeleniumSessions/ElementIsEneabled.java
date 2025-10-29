package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEneabled {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		boolean f1= driver.findElement(By.id("fname")).isEnabled();
		System.out.println(f1);
		
		boolean f2= driver.findElement(By.id("pass")).isEnabled();
		System.out.println(f2);
		
		By password=By.id("pass");
		
		boolean b1= isElementEnabled(password);
		System.out.println(b1);
		
	}
	
	public static WebElement getWebElement(By locater) {
		return driver.findElement(locater);
	}
	
	public static boolean isElementEnabled(By Locater) {
		return getWebElement(Locater).isEnabled();
	}

}
