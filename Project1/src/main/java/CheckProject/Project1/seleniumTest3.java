package CheckProject.Project1;

import org.testng.ISuiteListener;
import org.testng.annotations.Test;

public class seleniumTest3{
	@Test
	public void facebook(){
		BrowserFactory browserFactory = BrowserFactory.getInstance();
		browserFactory.setDriver("chrome");
		browserFactory.getDriver().get("http://www.facebook.com");
		browserFactory.getDriver().quit();
	}
	@Test
	public void google(){
		BrowserFactory browserFactory1 = BrowserFactory.getInstance();
		browserFactory1.setDriver("chrome");
		browserFactory1.getDriver().get("http://www.google.com");
		browserFactory1.getDriver().quit();
	}
	@Test
	public void gmail(){
		BrowserFactory browserFactory2 = BrowserFactory.getInstance();
		browserFactory2.setDriver("chrome");
		browserFactory2.getDriver().get("http://www.gmail.com");
		browserFactory2.getDriver().quit();
	}
}
