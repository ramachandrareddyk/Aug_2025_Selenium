package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleCLick {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));
		
		Actions act= new Actions(driver);
		
		act.doubleClick(doubleClickBtn).perform();
		
		

	}

}
