package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightContextClick {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclickBtn= driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		
		Actions act =new Actions(driver);
		
		act.contextClick(rightclickBtn).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	}

}
