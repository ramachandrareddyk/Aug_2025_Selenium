package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcep {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		//1. direct intraction with an element
//		driver.findElement(By.id("email")).sendKeys("TestUser");
//		driver.findElement(By.id("pass")).sendKeys("Test@123");
//		driver.findElement(By.name("login")).click();
		
		//2. using webElement
//		WebElement username= driver.findElement(By.id("email"));
//		WebElement password= driver.findElement(By.id("pass"));
//		WebElement loginBtn= driver.findElement(By.name("login"));
//		
//		username.sendKeys("TestUser");
//		password.sendKeys("Test@123");
//		loginBtn.click();
		
		//3. By locater
//		By username=By.id("email");
//		By password=By.id("pass");
//		By loginbtn=By.name("login");
//		
//		driver.findElement(username).sendKeys("testUser");
//		driver.findElement(password).sendKeys("Test@123");
//		
//		WebElement Username=driver.findElement(username);
//		WebElement Password=driver.findElement(password);
		
		//4 By locater + Genaric method for webElement
//		
//		By username=By.id("email");
//		By password=By.id("pass");
//		By loginbtn=By.name("login");
//		
//		getWebElement(username).sendKeys("Test User");
//		getWebElement(password).sendKeys("Test@345");
//		
//		WebElement Username= getWebElement(username);
//		Username.clear();
//		Username.sendKeys("Admin");
		
		//5 By Locater + genaric method+ action
		
		By username=By.id("email");
		By password=By.id("pass");
		By loginbtn=By.name("login");
		
		doSendKeys(username, "Admin user");
		doSendKeys(password, "Admin@123");
		
		doClick(loginbtn);
		

	}
	
	public static void doSendKeys(By locater, String value) {
		getWebElement(locater).clear();
		getWebElement(locater).sendKeys(value);
	}
	
	public static void doClick(By locater) {
		getWebElement(locater).click();
	}
	
	
	
	public static WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}

}
