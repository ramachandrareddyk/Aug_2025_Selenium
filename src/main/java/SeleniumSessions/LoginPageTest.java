package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtilities butils=new BrowserUtilities();
		
		WebDriver driver= butils.initBrowser("chrome");
		
		butils.launchurl("https://www.facebook.com");
		
		System.out.println(butils.doGetPageTitle());
		
		By username=By.id("email");
		By password=By.id("pass");
		By loginbtn=By.name("login");
		
		ElementUtil elutils=new ElementUtil(driver);
		elutils.doSendKeys(username, "Admin");
		elutils.doSendKeys(password, "Admin@123");
		elutils.doClick(loginbtn);
	}

}
