package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromWebPage {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		String header=driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(header);
		
		String text=driver.findElement(By.xpath("//span[text()='Saturday, September 24, 2016']")).getText();
		System.out.println(text);
		
		
		
	}

}
