package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		By parentMenu=By.xpath("//div[text()='SpiceClub']");
		By childManu=By.xpath("//div[text()='Benefits']");
		
//		Actions act= new Actions(driver);
//		
//		act.moveToElement(driver.findElement(parentMenu)).perform();
//		act.click(driver.findElement(childManu)).perform();
		
		ParentChaildManu(parentMenu,childManu);

	}
	
	public static void ParentChaildManu(By parent, By child) throws InterruptedException {
		Actions act= new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		Thread.sleep(3000);
		getElement(child).click();
	}
	
	
	public static WebElement getElement(By locater) {
		return driver.findElement(locater);
	}

}
