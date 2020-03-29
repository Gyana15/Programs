package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.Test;

public class seleniumTest2{
	protected WebDriver driver;
	@Test
	public void gmail(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe");
		driver=ThreadGuard.protect(new ChromeDriver());
		try{
			assert driver.getWindowHandles().size() == 1;
		//driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		//driver.get("http://www.google.com");
			Runnable r1 = () -> {driver.get("http://www.gmail.com");};
			Thread t1 = new Thread(r1);
			t1.start();
		driver.manage().window().maximize();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
