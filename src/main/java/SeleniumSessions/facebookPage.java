package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookPage {
	public static void main(String[] args) {
		WebDriver driver;
		BrowserUtilities utils= new BrowserUtilities();
		
		String browsername="chrome";
		
		driver=utils.initBrowser(browsername);
		
		//driver.get("https://www.facebook.com");
		
		driver.get("https://facebook.com");
		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		
//		String source=driver.getPageSource();
//		System.out.println(source);
		
		
		String title=utils.doGetPageTitle();
		System.out.println(title);
		
		String url=utils.doGetCurrentPageTitle();
		System.out.println(url);
		
		//driver.close();
		
		//driver.quit();
		
	}

}
