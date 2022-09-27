package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionskeyboard_1 {

	public static void main(String[] args) throws Throwable {
		// perform actions using keyboard methods
		WebDriver strange=new ChromeDriver();
		strange.manage().window().maximize();
		strange.manage().deleteAllCookies();
		strange.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		strange.findElement(By.cssSelector("#amc")).click();
		Thread.sleep(4000);
		Actions dance=new Actions(strange);
		dance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		dance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		dance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		dance.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(4000);
		
		
		
		
		
		
		

	}

}
