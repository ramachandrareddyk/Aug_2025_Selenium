package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasketMultiMenuHandling {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		
		By leval1=By.xpath("(//span[text()='Shop by'])[2]");
		By leval2=By.linkText("Baby Care");
		By leval3=By.linkText("Feeding & Nursing");
		By Leval4=By.linkText("Nursing Tools");
		
		parentChildMenu(leval1, leval2, leval3, Leval4);
	}
	
	public static void parentChildMenu(By leval1, By leval2, By leval3, By leval4) throws InterruptedException {
		getElement(leval1).click();
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(getElement(leval2)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(leval3)).perform();
		Thread.sleep(2000);
		getElement(leval4).click();
	}
	
	public static WebElement getElement(By Locater) {
		return driver.findElement(Locater);
	}

}
