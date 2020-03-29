import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jUnitPlay {

	@Test(priority=-2)
	public void playUnit1(){
		System.out.println("-2");
	}
	
	@Test(priority=-3)
	public void playUnit2(){
		System.out.println("-3");
	}
	@Test(priority=1, groups="strong_ties")
	public void playUnit3(){
		System.out.println("1");
	}
	
	@Test(priority=2)
	public void playUnit4(){
		System.out.println("2");
	}
	
	@Test(priority=0, enabled=false)
	public void playUnit5(){
		System.out.println("0");
	}
@BeforeTest
public void beforetest(){
	System.out.println("Before Test");
}
@BeforeMethod
public void beforemethod(){
	System.out.println("Before Method");
}
	@Test(priority=1, dependsOnMethods="check2", enabled=false)
	public void check1(){
		System.out.println("Switching 1...............");
	}
	
	@Test(priority=2, dependsOnMethods="check1", enabled=false)
	public void check2(){
		System.out.println("Switching 2...............");
	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Before suite");
	}
	@BeforeGroups
	public void beforegroups(){
		System.out.println("Before Groups");
	}
}
