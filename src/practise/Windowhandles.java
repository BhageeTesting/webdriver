package practise;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandles {

	public static void main(String[] args)throws Throwable {
		WebDriver con=new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.navigate().to("https://www.nykaa.com/");
		con.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		Actions ac= new Actions(con);
		ac.moveToElement(con.findElement(By.xpath("(//a[normalize-space()='men'])[1]"))).perform();
		ac.moveToElement(con.findElement(By.xpath("//a[normalize-space()='Luxe Fragrances']"))).click().perform();
		//store windows into arraylist
		String parent=con.getWindowHandle();
		Set<String>allwins=con.getWindowHandles();
		
		//switch to child window
		
	ac.moveToElement(con.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"))).click().sendKeys("Nykaa").perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		String text= con.findElement(By.xpath("(//div[@class='css-lmt24f'])[1]")).getText();
		System.out.println("   "+text+"  ");
		con.close();
		//switch back to parent
		con.switchTo().window(parent);
		con.getTitle();
		
		 
		
		
	}

}
