package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement>langLinks= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinks.size());//9
		
		for(WebElement e: langLinks) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.contains("తెలుగు")) {
				e.click();
				break;
			}
		}

	}

}
