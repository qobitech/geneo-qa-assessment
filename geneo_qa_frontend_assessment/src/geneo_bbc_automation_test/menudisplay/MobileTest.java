package geneo_bbc_automation_test.menudisplay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MobileTest {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromewebdriver\\chromedriver.exe");

		String baseUrl = "http://www.bbc.com";

		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Pixel 2");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(baseUrl);
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li"));
		
		System.out.println("Number of menu items is "+listOfElements.size());
		
		System.out.println("Menu items on display in mobile screen");
		listOfElements.forEach(i -> {
			if(i.getText().length() > 0) {
				System.out.println(i.getText());
			}
		});
		
		driver.close();
		System.exit(0);
	}
}
