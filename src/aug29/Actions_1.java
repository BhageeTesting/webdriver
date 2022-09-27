package aug29;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {

	public static void main(String[] args) throws Throwable {
		// Perform keyboard actions
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://nykaa.com");
		Thread.sleep(5000);
		
		//create object for actions
		Actions dc=new Actions(skull);
		//dc.moveToElement(skull.findElement(By.linkText("luxe"))).perform();
		//Thread.sleep(3000);
		dc.moveToElement(skull.findElement(By.xpath("(//a[@target='_blank'][normalize-space()='Bath & Body'])[4]"))).perform();
		Thread.sleep(2000);
		dc.moveToElement(skull.findElement(By.linkText("Bath & Body Combos"))).click().perform();
		Thread.sleep(5000);
		ArrayList<String> allwins=new ArrayList<String>(skull.getWindowHandles()) ; 
		skull.switchTo().window(allwins.get(0));
		skull.close();
		Thread.sleep(3000);
		
		skull.switchTo().window(allwins.get(1));
		
		skull.findElement(By.xpath("(//img[@alt='Wanderlust Bath & Body Bestseller Duo'])[1]")).click();
		Thread.sleep(4000);
		skull.close();
		
		
//		//skull.switchTo().window(allwins.get(2));
//		Thread.sleep(3000);
//		skull.close();

		
		
		

	}

}
