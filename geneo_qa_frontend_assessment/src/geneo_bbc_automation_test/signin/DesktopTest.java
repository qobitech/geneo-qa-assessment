package geneo_bbc_automation_test.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesktopTest {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromewebdriver\\chromedriver.exe");

		String baseUrl = "http://www.bbc.com";

		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		try {
			System.out.println(driver.findElement(By.cssSelector("#idcta-link > span")).getCssValue("position").equals("static"));
		} catch (NoSuchElementException e) {
		     System.out.println("No Such Element Found");
		}
		driver.close();
		System.exit(0);
	}
}
