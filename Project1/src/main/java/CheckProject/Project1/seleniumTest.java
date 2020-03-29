package CheckProject.Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class seleniumTest {
	protected WebDriver driver;
//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "//IEDriverServer_x64_2.53.1//IEDriverServer.exe");
	@Test
	public void google() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver.exe");
		driver=new ChromeDriver();
		try{
		//driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
			
		driver.get("http://www.google.com");
		Dimension d = new Dimension(300,1080);
		driver.manage().window().setSize(d);
		//driver.navigate().to("www.gmail.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Gyan");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		driver.close();
	}
	
	@Test
	public void facebook(){
		BrowserFactory browserFactory = BrowserFactory.getInstance();
		browserFactory.setDriver("chrome");
		browserFactory.getDriver().get("http://www.facebook.com");
		browserFactory.getDriver().quit();
	}
	
	

}
