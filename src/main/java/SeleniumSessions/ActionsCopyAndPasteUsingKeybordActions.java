package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.net.PercentEscaper;

public class ActionsCopyAndPasteUsingKeybordActions {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement firstName= driver.findElement(By.id("userName"));
		WebElement userEmail=driver.findElement(By.id("userEmail"));
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		
		//Actions act = new Actions(driver);
		
		firstName.sendKeys("Mukul");
		firstName.sendKeys(Keys.TAB);
		userEmail.sendKeys("mukul@abc.com");
		userEmail.sendKeys(Keys.TAB);
		currentAddress.sendKeys("Banglore");
		currentAddress.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		currentAddress.sendKeys(Keys.CONTROL,"c");
		currentAddress.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		permanentAddress.sendKeys(Keys.CONTROL,"v");
		

	}

}
