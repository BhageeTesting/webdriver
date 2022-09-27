package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver con= new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get("https://flipkart.com");
		con.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		org.openqa.selenium.interactions.Actions ac= new org.openqa.selenium.interactions.Actions(con);
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.moveToElement(con.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))).click().sendKeys("shoes").perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ENTER).perform();
		ac.moveToElement(con.findElement(By.xpath("(//span[normalize-space()='Men'])[1]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(con.findElement(By.xpath("(//a[normalize-space()='Jackets'])[1]"))).click().perform();
		Thread.sleep(3000);
		ac.moveToElement(con.findElement(By.linkText("About Us"))).contextClick().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		

	}

}
