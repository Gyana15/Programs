package Selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	private static BrowserFactory instance;
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private BrowserFactory(){
	
	}
	public static BrowserFactory getInstance(){
		if(instance==null){
			instance=new BrowserFactory();
		}
		return instance;
	}
	public final void setDriver(String browser) {
		DesiredCapabilities capability = null;
		switch(browser){
		case "chrome":
			capability = DesiredCapabilities.chrome();
			ChromeOptions chOptions = new ChromeOptions();
			Map<String,Object> chPref = new HashMap<String,Object>();
			chPref.put("credentials_enable_service", false);
			chOptions.setExperimentalOption("prefs", chPref);
			chOptions.addArguments("--disable-plugins","--disable-extensions","--disable-popup-blocking");
			capability.setCapability(chOptions.CAPABILITY, chOptions);
			capability.setCapability("applicationCacheEnabled", false);
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe");
			webDriver.set(new ChromeDriver());
		}
	}
public WebDriver getDriver(){
	return webDriver.get();
}
}
