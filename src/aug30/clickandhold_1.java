package aug30;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold_1 {

	public static void main(String[] args) throws Throwable {
		// Right click on some option 
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.get("https://amazon.in");
		Thread.sleep(5000);
		Actions dc=new Actions(skull);
		dc.moveToElement(skull.findElement(By.linkText("Mobiles"))).contextClick().perform();
		
		//perform window based operstion on right click window
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//give access to child
		
		ArrayList<String> wins=new ArrayList<String>(skull.getWindowHandles());
		
		skull.switchTo().window(wins.get(1));
		
		
		dc.moveToElement(skull.findElement(By.xpath("(//img[@alt='Starting ₹99'])[2]"))).click().perform();
		Thread.sleep(5000);
		//dc.moveToElement(skull.findElement(By.cssSelector("li[id='sobe_d_b_2_6'] img[alt='Starting ₹99']"))).click().perform();
		//Thread.sleep(5000);
		dc.moveToElement(skull.findElement(By.xpath("//img[@alt='mi']"))).click().perform();
		Thread.sleep(4000);
		dc.moveToElement(skull.findElement(By.xpath("//a[@title='Redmi K20 Pro']"))).click().perform();
		Thread.sleep(6000);
		//dc.moveToElement(skull.findElement(By.xpath("//img[@alt='REALCASE Back Cover For Xiaomi Redmi K20/ K20 Pro ( TPU|CF-Black )']"))).click().perform();
		//Thread.sleep(5000);
		dc.moveToElement(skull.findElement(By.linkText("Canada"))).click().perform();
		Thread.sleep(5000);
		skull.close();
		 
		//switch back to parent
		
		skull.switchTo().window(wins.get(0));
		
		dc.moveToElement(skull.findElement(By.linkText("Sign in securely"))).click().perform();
		Thread.sleep(5000);
		skull.close();
		
		
		
		
		

	}

}
