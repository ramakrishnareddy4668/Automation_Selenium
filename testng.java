package seleniu;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testng {
	//@Ignore
	@Test()
	public void test1()
	{
		System.out.println("test2");
		
	}
	@Test(priority=3)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(priority=-5)
	public void test2()
	{
		System.out.println("test1");
		
	}
	@BeforeMethod()
	public void zero()
	{
		System.out.println("test ww");

	}
	@AfterMethod()
	public void six()
	{
		System.out.println("test xx");
	}
	@BeforeTest
	public void zero1()
	{
		System.out.println("test y");

	}
	@AfterTest
	public void six1()
	{
		System.out.println("test z");
	}

}
