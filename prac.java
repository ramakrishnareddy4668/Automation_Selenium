package seleniu;

import java.io.File;

import javax.annotation.concurrent.NotThreadSafe;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v133.page.Page.NavigateResponse;
import org.openqa.selenium.edge.EdgeDriver;

public class prac {

	public static void main(String[] args) throws InterruptedException {
//	WebDriver D1=new ChromeDriver();
//	D1.get("https://www.google.com");
	//System.out.println(D1);
	
	WebDriver D2=new EdgeDriver();
	D2.get("https://www.google.com");
	//System.err.println(D2);
	//D1.get("https://www.google.com");
	Thread.sleep(9000);
	D2.get("https://www.geeksforgeeks.org/software-testing-basics/");
	Thread.sleep(300);
	D2.navigate().refresh();
	D2.get("https://www.google.com");
	
//	File file = ((TakesScreenshot) D1).getScreenshotAs(OutputType.FILE);
//	String screenshotBase64 = ((TakesScreenshot)D1).getScreenshotAs(OutputType.BASE64);

	D2.manage().window().maximize();
	Thread.sleep(9000);
	D2.manage().window().minimize();
	D2.navigate().back();
	//D1.quit();
	Thread.sleep(300);
	D2.quit();
	 
	}

}
