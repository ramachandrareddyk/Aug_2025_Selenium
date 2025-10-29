package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersConcept {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//we have 8 locaters in selenium
		//1. ID
		//2. Name
		//3. Class Name
		//4. CSS Selector--Caskading stylesheets
		//5. xpath
		//6. link text
		//7. Partial link text
		//8. tag name
		
		//1. ID Unique for every element--I
		//driver.findElement(By.id("email")).sendKeys("TestUser");
		//driver.findElement(By.id("pass")).sendKeys("Test@123");
		
		//2. Name-II
		//driver.findElement(By.name("email")).sendKeys("Testuser");
		//driver.findElement(By.name("pass")).sendKeys("Test@123");
		//driver.findElement(By.name("login")).click();
		
		//3. class name --III
		//driver.findElement(By.className("_6luy")).sendKeys("Testuser");//---5--1st element
		//driver.findElement(By.className("_9npi")).sendKeys("Test@123");
		
		//4 CSS--it's not attribute
		//driver.findElement(By.cssSelector("#email")).sendKeys("Testuser");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("Test@123");
		
		//5. xpath it's not a attribute
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Testuser");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Test@123");
		
		//6. link text
		//driver.findElement(By.linkText("Create new account")).click();
		
		//7. partial link text
		//driver.findElement(By.partialLinkText("new")).click();
		
		//8. tagname
		//driver.findElement(By.tagName("button")).click();
		

	}

}
