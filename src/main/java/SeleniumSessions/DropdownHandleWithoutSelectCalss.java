package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandleWithoutSelectCalss {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		ElementUtil utils = new ElementUtil(driver);

		By FullName = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		By phoneNumber = By.id("Form_getForm_Contact");
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");

		utils.doSendKeys(FullName, "Ram");
		utils.doSendKeys(email, "ram@abc.com");
		utils.doSendKeys(phoneNumber, "234567890");
		selectDropDownValue(country, "India");

	}
	
	public static void selectDropDownValue(By Locater, String Value) {
		List<WebElement>OptionsList= driver.findElements(Locater);
		System.out.println(OptionsList.size());
		for(WebElement e:OptionsList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(Value)) {
				e.click();
				break;
			}
		}
		
	}

}
