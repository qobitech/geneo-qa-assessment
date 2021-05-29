package geneo_bbc_automation_test.signin;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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
		
		try {
			System.out.println(driver.findElement(By.cssSelector("#idcta-link > span")).getCssValue("position").equals("static"));
		} catch (NoSuchElementException e) {
		     System.out.println("Barcode selected");
		}
		driver.close();
		System.exit(0);
	}
}
