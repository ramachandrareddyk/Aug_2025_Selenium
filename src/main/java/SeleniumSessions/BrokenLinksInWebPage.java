package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksInWebPage {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement e:links) {
			String urlLink=e.getAttribute("href");
			
			//URL url= new URL(urlLink);
			
			HttpURLConnection conn=(HttpURLConnection) new URL(urlLink).openConnection();
			
			conn.setRequestMethod("HEAD");
			
			conn.connect();
			
			int responcecode=conn.getResponseCode();//100 200 300 400  500
			if(responcecode>=400) {
				System.out.println(urlLink+"->Broken Link "+"Responce code is :"+responcecode);
			}else {
				System.out.println(urlLink+"->Valid Link "+"Responce code is :"+responcecode);
			}
			
		}
		

	}

}
