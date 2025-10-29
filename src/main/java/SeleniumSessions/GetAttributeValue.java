package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		
		String text= driver.findElement(By.xpath("//input[@value='Show me']")).getDomAttribute("type");
		System.out.println(text);
		
		driver.findElement(By.id("fname")).sendKeys("Test user");
		
		
		String text1=driver.findElement(By.id("fname")).getAttribute("value");
		System.out.println(text1);
		
		
	}

}
