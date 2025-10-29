package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}
	
	public void doClick(By Locater) {
		getWebElement(Locater).click();
	}
	
	public void doSendKeys(By Locater, String Value) {
		getWebElement(Locater).sendKeys(Value);
	}

}
