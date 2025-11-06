package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		By firstname= By.name("firstname");
		By lastNAme=By.name("lastname");
		
		By submitBtn=By.name("websubmit");
		
		
		doActonsSendkeysWithPause(firstname,"Ramesh Kumar",500);

	}
	
	public static void doActonsSendkeysWithPause(By Locater, String Value, long pauseTime) {
		Actions act = new Actions(driver);
		char ch[]= Value.toCharArray();
		for(char c:ch) {
			act.sendKeys(getElement(Locater),String.valueOf(c)).pause(pauseTime).perform();
		}
		
		
	}
	public static WebElement getElement(By locater) {
		return driver.findElement(locater);
	}

}
