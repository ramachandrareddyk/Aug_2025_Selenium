package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBoostarpDropdowns {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(4000);
		
		List<WebElement>rolesList= driver.findElements(By.xpath("//a[@role='menuitem']"));
		System.out.println(rolesList.size());
		for(WebElement e:rolesList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("HTML")) {
				e.click();
			}
		}
	}

}
