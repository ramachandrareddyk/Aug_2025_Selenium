package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLipkartGetAllTheImages {

	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement>langLinks= driver.findElements(By.tagName("img"));
		System.out.println(langLinks.size());
		

	}

}
