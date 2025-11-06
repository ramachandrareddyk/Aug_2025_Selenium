package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("#imageTemplateContainer > img")).click();
		
		Thread.sleep(10000);
		
		driver.switchTo().frame(1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Titles of the vehical");
	}

}
