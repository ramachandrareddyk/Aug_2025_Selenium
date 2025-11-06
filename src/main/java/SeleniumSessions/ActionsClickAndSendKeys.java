package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		WebElement lastNAme=driver.findElement(By.name("lastname"));
		
		WebElement submitBtn=driver.findElement(By.name("websubmit"));
		
//		firstname.sendKeys("Tom");
//		lastNAme.sendKeys("Peter");
//		
//		submitBtn.click();
		
		Actions act= new Actions(driver);
		
		act.sendKeys(firstname,"Tom").perform();
		act.sendKeys(lastNAme,"Peter").perform();
		
		act.click(submitBtn).perform();

	}

}
