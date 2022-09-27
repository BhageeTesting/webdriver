package aug30;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_1 {
         //write new program again
	public static void main(String[] args) throws Throwable {
		// drag and drop by using coordinates
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airbnb.co.in/");
		Thread.sleep(5000);
		//create action object
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//img[@id='FMP-target'])[1]"))).click().perform();
		Thread.sleep(5000);
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		
	driver.switchTo().window(wins.get(1));
	ac.moveToElement(driver.findElement(By.linkText("Try hosting"))).click().perform();
	Thread.sleep(5000);
	ac.moveToElement(driver.findElement(By.linkText("How to host responsibly"))).contextClick().perform();
	Thread.sleep(3000);
Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(3000);
robo.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);

driver.switchTo().window(wins.get(2));
ac.moveToElement(driver.findElement(By.xpath("(//span)[43]"))).click().perform();
Thread.sleep(4000);
driver.close();

driver.switchTo().window(wins.get(1));
ac.moveToElement(driver.findElement(By.linkText("Ask a Superhost"))).click().perform();
Thread.sleep(4000);
driver.close();

driver.switchTo().window(wins.get(0));
Thread.sleep(2000);
driver.close();

	
	
		
		
		
		

	}

}
