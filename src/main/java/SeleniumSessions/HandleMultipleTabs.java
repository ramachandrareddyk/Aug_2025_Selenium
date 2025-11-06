package SeleniumSessions;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMultipleTabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		WebElement AboutUs= driver.findElement(By.linkText("About Us"));
		WebElement PressReleases=driver.findElement(By.linkText("Press Releases"));
		WebElement NewsArticles=driver.findElement(By.linkText("News Articles"));
		
		
		Actions act= new Actions(driver);
		
		act.click(AboutUs).perform();
		act.click(PressReleases).perform();
		act.click(NewsArticles).perform();
		
		//fetch the window id's
		
		Set<String>handles= driver.getWindowHandles();
		
		Iterator<String>it= handles.iterator();
		while(it.hasNext()) {
			String widowid=it.next();
			driver.switchTo().window(widowid);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
