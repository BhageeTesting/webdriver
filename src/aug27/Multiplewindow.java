package aug27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) throws Throwable {
		                              //NOT EXECUTED
		
		// open multiple windows and get collection of window ids and print their window titles one by one
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//p[normalize-space()='LIVE NOW: Wed & Thurs DEALS']")).click();
		driver.findElement(By.xpath("//div[@data-cy='superOffers']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//p[2]")).click();
		driver.findElement(By.xpath("(//img)[14]")).click();
		Thread.sleep(5000);
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		//collection of window handles
		
		Set<String> allwins=driver.getWindowHandles();
		System.out.println(allwins);
		
		//get titles of widows one by one
		
		for (String each : allwins) {
			String pagetitle=driver.switchTo().window(each).getTitle();
			System.out.println(pagetitle);
			Thread.sleep(4000);
			driver.close();
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		

	}

}
