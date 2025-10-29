package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleOpttionsAndCheckBox {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/12/");
		
		driver.findElement(By.id("male")).click();
		
		boolean flag= driver.findElement(By.id("male")).isSelected();
		
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Option is selected");
		}else {
			System.out.println("Option is not selected");
		}
		
		driver.findElement(By.name("hobby")).click();
		
		boolean b= driver.findElement(By.name("hobby")).isSelected();
		System.out.println(b);
		if(b) {
			System.out.println("Check box is selected");
		}else {
			System.out.println("Check box is not selected");
		}
		

	}

}
