package sep1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_2 {

	public static void main(String[] args) throws Throwable {
		//launchurl,domain,scroll top to bottom &bottom and top,certain pixel,scroll to specific element
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		//launch url
		JavascriptExecutor start=(JavascriptExecutor)skull;
		start.executeScript("window.location='https://airbnb.co.in'" );
		Thread.sleep(5000);
		String pageTitle=start.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		System.out.println(pageTitle.length());
		
		//domain name
		
		String domain=start.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		
		//scroll top to down &bottom to top
		 
		start.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		start.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		//certain pixel
		start.executeScript("window.scrollBy(0,700)");
		Thread.sleep(5000);
		
		//scroll to certain element
		WebElement detail=skull.findElement(By.linkText("Company details"));
		start.executeScript("window.scrollIntoView",detail);
		detail.click();
		
		ArrayList<String> wins=new ArrayList<String>(skull.getWindowHandles());
		System.out.println(wins);
		
		skull.switchTo().window(wins.get(1));
		 String pageTitles=start.executeScript("return document.title").toString();
		 System.out.println(pageTitles);
		 System.out.println(pageTitles.length());
		 skull.close();
		 
		 skull.switchTo().window(wins.get(0));
		 Thread.sleep(5000);
		 skull.close();
		 
		 
		
		
		
		
		

	}

}
