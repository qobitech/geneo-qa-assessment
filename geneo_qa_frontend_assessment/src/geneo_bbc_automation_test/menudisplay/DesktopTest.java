package geneo_bbc_automation_test.menudisplay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import geneo_bbc_automation_test.WebDriverDir;


public class DesktopTest {
	public static void main (String [] args) {
		//for chrome use "chrome"
		//for firefox use "firefox"
		//for internetexplorer use "ie"
		WebDriverDir wd = new WebDriverDir("ie");
		
		System.setProperty(wd.getWebDriver(),wd.getDriverDirectory());

		String baseUrl = "http://www.bbc.com";

//		WebDriver driver = new InternetExplorerDriver();
//		WebDriver driver = new FireFoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li"));
		
		System.out.println("Number of menu items is "+listOfElements.size());
		
		System.out.println("Menu items on display in desktop screen");
		
		listOfElements.forEach(i -> {
			if(i.getText().length() > 0) {
				System.out.println(i.getText());
			}
		});
		
		driver.close();
		System.exit(0);
	}
}
