package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		Set<String>handles= driver.getWindowHandles();//2
		
		Iterator<String>it= handles.iterator();
		
		String parentWindowid=it.next();
		String childWindowid=it.next();
		System.out.println("Parent window id is :"+parentWindowid);
		System.out.println("child window id is :"+childWindowid);
		
		
		//driver.close();
		driver.switchTo().window(childWindowid);
		
		//System.out.println(driver.getTitle());
		
		driver.quit();
		
		//driver.switchTo().window(parentWindowid);
		
		//driver.close();
		
		

	}

}
