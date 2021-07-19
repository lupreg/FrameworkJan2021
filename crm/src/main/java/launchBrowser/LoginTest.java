package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//go to website
		driver.get("https://palaceskateboards.com");
	
	}
}
