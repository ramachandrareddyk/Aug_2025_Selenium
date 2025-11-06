package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String parentWindowid=driver.getWindowHandle();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		//driver.switchTo().newWindow(WindowType.TAB);//it will open a new tab and it will switch to it
		
//		driver.get("https://www.facebook.com");
//		
//		String title=driver.getTitle();
//		System.out.println(title);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindowid);
		System.out.println(driver.getTitle());
		
		

	}

}
