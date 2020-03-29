package Selenium;

import static org.testng.Assert.assertEquals;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.WindowConstants;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumBrowserMovements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
String originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
assert driver.getWindowHandles().size() == 1;

//Click the link which opens in a new window
driver.findElement(By.linkText("new window")).click();

//Wait for the new window or tab

//Loop through until we find a new window handle
for (String windowHandle : driver.getWindowHandles()) {
  if(!originalWindow.contentEquals(windowHandle)) {
      driver.switchTo().window(windowHandle);
      break;
  }
}

//Wait for the new tab to finish loading content

//Opens a new tab and switches to new tab
//driver.switchTo().newWindow();

//Opens a new window and switches to new window
//driver.switchTo().newWindow(WindowType.WINDOW);

//Close the tab or window
driver.close();

//Switch back to the old tab or window
driver.switchTo().window(originalWindow);

//Using the ID
driver.switchTo().frame("buttonframe");

//Or using the name instead
driver.switchTo().frame("myframe");

//Now we can click the button
driver.findElement(By.tagName("button")).click();

//Switches to the second frame  
driver.switchTo().frame(1);

//Return to the top level
driver.switchTo().defaultContent();

//Access each dimension individually
int width = driver.manage().window().getSize().getWidth();
int height = driver.manage().window().getSize().getHeight();

//Or store the dimensions and query them later
Dimension size = driver.manage().window().getSize();
int width1 = size.getWidth();
int height1 = size.getHeight();

driver.manage().window().setSize(new Dimension(1024, 768));

//Access each dimension individually
int x = driver.manage().window().getPosition().getX();
int y = driver.manage().window().getPosition().getY();


//Move the window to the top left of the primary monitor
driver.manage().window().setPosition(new Point(0, 0));

driver.manage().window().fullscreen();

driver.get("file:///race_condition.html");
WebElement element = driver.findElement(By.tagName("p"));
assertEquals(element.getText(), "Hello from JavaScript!");
//Initialize and wait till element(link) became clickable - timeout in 10 seconds
WebElement firstResult = new WebDriverWait(driver, 10/*Duration.ofSeconds(10)*/)
     .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

WebElement foo = new WebDriverWait(driver, 10/*Duration.ofSeconds(3)*/)
.until(driver1 -> driver1.findElement(By.name("q")));
assertEquals(foo.getText(), "Hello from JavaScript!"); 

//Waiting 30 seconds for an element to be present on the page, checking
//for its presence once every 5 seconds.
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(100,TimeUnit.SECONDS/*Duration.ofSeconds(30)*/)
.pollingEvery(5,TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);

WebElement foo1 = wait.until(new Function<WebDriver, WebElement>() {
public WebElement apply(WebDriver driver) {
 return driver.findElement(By.id("foo"));
}
});
driver.get("http://www.google.com");
driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

// Get attribute of current active element
String attr = driver.switchTo().activeElement().getAttribute("title");
System.out.println(attr);
	}

}
