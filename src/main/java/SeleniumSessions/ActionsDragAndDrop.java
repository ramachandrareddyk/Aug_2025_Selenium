package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By sourceElement=By.id("draggable");
		By targetElement=By.id("droppable");
		
//		Actions act= new Actions(driver);
//		
//		//act.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
//		
//		act.clickAndHold(driver.findElement(sourceElement)).
//		moveToElement(driver.findElement(targetElement)).release().build().perform();
		
		doDragAndDrop1(sourceElement, targetElement);

	}
	
	public static void doDragAndDrop(By Souurce, By target) {
		Actions act= new Actions(driver);
		act.dragAndDrop(getElement(Souurce), getElement(target)).perform();
	}
	
	
	public static void doDragAndDrop1(By Souurce, By target) {
		Actions act= new Actions(driver);
		act.clickAndHold(getElement(Souurce)).
		moveToElement(getElement(target)).release().build().perform();
	}
	
	
	public static WebElement getElement(By Locater) {
		return driver.findElement(Locater);
	}

}
