package seleniu;



import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{	    
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		WebElement rk=driver.findElement(By.xpath("//textarea[@maxlength='2048']"));
//		rk.sendKeys("https://qualitythought.in/");
		
		driver.get("https://www.googlemail.com/");
		WebElement rk3=driver.findElement(By.xpath("//input[@type='email']"));
		rk3.sendKeys("bar@gmail.com");
		
		
//		WebElement rk1=driver.findElement(By.xpath("//span[@class=\"QCzoEc z1asCe MZy1Rb\"]"));
//		rk1.click();
//		
				//.xpath(//textarea[@maxlength="2048"]));
		
				
		//	driver.getScreenShot
		//1. convert our driver to TakesScreenShot interface
		TakesScreenshot tk=(TakesScreenshot) driver;
			
		//2. call getScreenshotMethod
		File scrnShot= tk.getScreenshotAs(OutputType.FILE);
				
		//3. Copy the screenshot from ram to HD..
		FileUtils.copyFile(scrnShot, new File("./g1.jpg"));		
		
		//TakesScreenshot tk=(TakesScreenshot) driver;
		File scShot= tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scShot, new File("./g2.jpg"));	

	}

}
		
		
