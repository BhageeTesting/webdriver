package Practise1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nykaa.com");
		Thread.sleep(5000);
		//move to element
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='fragrance']"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//a[@target='_blank'][normalize-space()='Dior'])[1]"))).click().perform();
		Thread.sleep(5000);
		//access multi windows//store in arraylist
		ArrayList<String> allwins=new ArrayList<String>(driver.getWindowHandles());
		
		//switch to child
		
		driver.switchTo().window(allwins.get(1));
		ac.moveToElement(driver.findElement(By.xpath("(//img)[42]"))).click().perform();
		Thread.sleep(5000);
		//switch to sub child
		
		
		//switch back to child
		driver.switchTo().window(allwins.get(1));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println();
		Thread.sleep(2000);
		driver.close();
		
		//switch back to parent
		driver.switchTo().window(allwins.get(0));
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		
		

		driver.switchTo().window(allwins.get(2));
		driver.findElement(By.xpath("//input[@placeholder='Your Email']")).sendKeys("bhageeradhthota@gmail.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.quit();
		
		
	
	}

}
