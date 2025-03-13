package seleniu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v133.page.Page.NavigateResponse;

public class webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/search?q=facebook+login&oq=fabebook&gs_lcrp=EgZjaHJvbWUqDwgCEAAYChiDARixAxiABDIGCAAQRRg5MhUIARAuGAoYgwEYxwEYsQMY0QMYgAQyDwgCEAAYChiDARixAxiABDIPCAMQABgKGIMBGLEDGIAEMgwIBBAAGAoYsQMYgAQyDAgFEAAYChixAxiABDIPCAYQABgKGLEDGIAEGIoFMgYIBxAFGEDSAQkxMTEzNWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
		Thread.sleep(9000);
		d.navigate().back();
		d.get("https://www.facebook.com/login/");
		Thread.sleep(9000);
		d.navigate().refresh();
		d.navigate().back();
		d.navigate().refresh();
		d.navigate().forward();
		WebElement f=d.findElement(By.id("email"));
		System.out.println(f);
		//d.quit();
		List<WebElement> g=d.findElements(By.tagName("div"));
		System.out.println(g);
		System.out.println(g.size());
}
}