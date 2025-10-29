package SeleniumSessions;

import java.awt.Choice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownWithSelectClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/en/book-a-free-demo");

		ElementUtil utils = new ElementUtil(driver);

		By FullName = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		By phoneNumber = By.id("Form_getForm_Contact");
		By country = By.id("Form_getForm_Country");

		utils.doSendKeys(FullName, "Ram");
		utils.doSendKeys(email, "ram@abc.com");
		utils.doSendKeys(phoneNumber, "234567890");

		//Select s = new Select(utils.getWebElement(country));
		// s.selectByVisibleText("India");

		// s.selectByValue("india");

		// s.selectByIndex(5);
		
		doSelectByvisableText(country, "India");

	}

	public static void doSelectByvisableText(By locater, String Value) {

		Select ss = new Select(getWebElement(locater));

		ss.selectByVisibleText(Value);

	}

	public static void doSelectByvalue(By locater, String Value) {

		Select ss = new Select(getWebElement(locater));

		ss.selectByValue(Value);

	}

	public static void doSelectByIndex(By locater, int index) {

		Select ss = new Select(getWebElement(locater));

		ss.selectByIndex(index);

	}

	public static WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}

}
