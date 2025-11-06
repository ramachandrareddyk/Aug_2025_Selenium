package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChaining {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement firstName= driver.findElement(By.id("userName"));
		
		Actions act = new Actions(driver);
		
		Action action= act.sendKeys(firstName,"Mukul")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("mukul@abc.com")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("Bangalore")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("Banglore")
		.build();
		
		action.perform();

	}

}
