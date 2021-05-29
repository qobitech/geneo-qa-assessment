package geneo_bbc_automation_test;

public class WebDriverDir {
	String userDirectory = System.getProperty("user.dir");
	String os = System.getProperty("os.name");
	
	private String driverDir = "";
	private String webDriver = "";
	
	public WebDriverDir(String browser) {
		setDriverDir(browser);
		setWebDriver(browser);
	}
	
	public void setDriverDir(String browser) {
		switch(browser) {
			case "chrome" :  this.driverDir = userDirectory+"\\drivers\\chromewebdriver\\chromedriver.exe"; break;
			case "ie" : 
				if(os.toLowerCase().contains("windows")) {
					this.driverDir = userDirectory+"\\drivers\\iedriver\\IEDriverServer.exe";
				}
				break;
			case "firefox" : 
				if(os.toLowerCase().contains("windows")) {
					this.driverDir = userDirectory+"\\drivers\\firefoxdriver\\windows\\geckodriver.exe";
				}else if(os.toLowerCase().contains("linux")) {
					this.driverDir = userDirectory+"\\drivers\\firefoxdriver\\linux\\geckodriver";
				}else if(os.toLowerCase().contains("mac")) {
					this.driverDir = userDirectory+"\\drivers\\firefoxdriver\\mac\\geckodriver";
				}
				break;
			default : System.out.println("OS and driver mis-match");break;
		}
	}
	
	public String getDriverDirectory() {
		return driverDir;
	}
	
	public void setWebDriver(String browser) {
		switch(browser) {
			case "chrome" : this.webDriver = "webdriver.chrome.driver"; break;
			case "firefox" : this.webDriver = "webdriver.gecko.driver"; break;
			case "ie" : this.webDriver = "webdriver.ie.driver"; break;
			default : this.webDriver = "webdriver.chrome.driver"; break;
		}
	}
	
	public String getWebDriver() {
		return webDriver;
	}
	
}
