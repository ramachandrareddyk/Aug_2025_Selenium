package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		Thread.sleep(2000);
		WebElement frame2= driver.findElement(By.name("content"));
		driver.switchTo().frame(frame2);
		
		String text=driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
	}

}
