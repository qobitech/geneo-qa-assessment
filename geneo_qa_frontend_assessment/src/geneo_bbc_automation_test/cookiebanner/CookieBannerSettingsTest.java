package geneo_bbc_automation_test.cookiebanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import geneo_bbc_automation_test.WebDriverDir;

public class CookieBannerSettingsTest {
	
public static void main(String[]args) {
		
		WebDriverDir wd = new WebDriverDir("chrome");
		
		System.setProperty(wd.getWebDriver(),wd.getDriverDirectory());
		
		//use UK Proxy to get BBC Cookie Banner
		Proxy proxy = new Proxy();
		proxy.setProxyType(ProxyType.MANUAL); 
		proxy.setHttpProxy("79.143.87.140:9090");
		proxy.setSslProxy("79.143.87.140:9090");
		proxy.setFtpProxy("79.143.87.140:9090");
		
		ChromeOptions options = new ChromeOptions();
	    options.setCapability("proxy", proxy);
	    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT_AND_NOTIFY);
	    
		WebDriver driver = new ChromeDriver(options);
		
		String baseUrl = "https://www.bbc.com/news/in-pictures-56580258";
			
		try {
			
			driver.get(baseUrl);
			
			WebElement cookieBannerDiv = driver.findElement(By.cssSelector(".ssrcss-u3tmht-ConsentBanner"));
			
			WebElement cookieBannerSettingsButton = driver.findElement(By.cssSelector(".ssrcss-qq5w5t-ConsentBannerLink"));
		
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			ExpectedCondition<Boolean> displayCookieBanner = arg0 -> cookieBannerDiv.isDisplayed();
			if(wait.until(displayCookieBanner)) {
				System.out.println("Cookie Banner displayed " + cookieBannerDiv.isDisplayed());				
				cookieBannerSettingsButton.click();
				System.out.println("Clicked Cookie Banner 'Take Me To Settings' button");
			}else {
				System.out.println("Time out");
				driver.close();
				driver.quit();
				System.exit(0);
			}

			@SuppressWarnings("deprecation")
			WebDriverWait urlChangeWait = new WebDriverWait(driver, 2000);
			ExpectedCondition<Boolean> urlIsCorrect = arg0 -> driver.getCurrentUrl().equals("https://www.bbc.co.uk/usingthebbc/cookies/how-can-i-change-my-bbc-cookie-settings/");
			if(urlChangeWait.until(urlIsCorrect)) {
				System.out.println("Redirected to Settings Page true");
				driver.close();
				driver.quit();
				System.exit(0);
			}else {
				System.out.println("Time out");
				driver.close();
				driver.quit();
				System.exit(0);
			}
		}catch(NoSuchElementException ee) {
				System.out.println("Time out");
				driver.close();
				driver.quit();
				System.exit(0);
		}catch(TimeoutException t) {
			System.out.println("Time out");
			driver.close();
			driver.quit();
			System.exit(0);
		}catch(NoSuchSessionException ns) {
			System.out.println("Exception");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
	}

}
