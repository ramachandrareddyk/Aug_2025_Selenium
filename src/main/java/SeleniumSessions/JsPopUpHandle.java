package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopUpHandle {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(4000);
		
		//driver.switchTo().alert().accept();
		
		Alert alt= driver.switchTo().alert();
		
		alt.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(4000);
		
		Alert a= driver.switchTo().alert();
		
		String text=a.getText();
		
		System.out.println(text);
		
		a.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(5000);
		Alert a1= driver.switchTo().alert();
		String text1=a1.getText();
		
		System.out.println(text1);
		
		a1.sendKeys("Automation Tester");
		
		a1.accept();
		
	}

}
