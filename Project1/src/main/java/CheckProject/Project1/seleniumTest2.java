package CheckProject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.Test;

public class seleniumTest2{
	protected WebDriver driver;
	@Test
	public void gmail(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe");
		
		
		//driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		//driver.get("http://www.google.com");
			driver.get("http://www.gmail.com");
			
		driver.manage().window().maximize();
		
	}
}
