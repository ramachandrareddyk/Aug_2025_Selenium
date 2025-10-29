package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsUsingSelect {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
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
		
		Select ss= new Select(utils.getWebElement(country));
		
		List<WebElement> A= ss.getOptions();
		
		for(int i=0;i<A.size();i++) {
			String value=A.get(i).getText();
			System.out.println(value);
			if(value.equals("India")) {
				A.get(i).click();
				break;
			}
	
		}
		
		
	}

}
