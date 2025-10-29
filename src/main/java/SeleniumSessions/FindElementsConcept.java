package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.tagName("k"));//NoSuchElementException
		
		List<WebElement>links= driver.findElements(By.tagName("k"));
		
		System.out.println(links.size());//0
		
		for(int i=0;i<links.size();i++) {
			String text=links.get(i).getText();
			
			System.out.println(text);
		}
		
	}

}
