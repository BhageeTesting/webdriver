package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboaractions_2 {

	public static void main(String[] args) throws Throwable {
		// perform actions on amazon both keyboard& mouse methods using Action class
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.navigate().to("https://amazon.com");
		Thread.sleep(5000);
		Actions search=new Actions(skull);
		search.moveToElement(skull.findElement(By.name("url"))).click().perform();
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(3000);
		search.moveToElement(skull.findElement(By.className("navFooterDescText"))).click().perform();
		Thread.sleep(4000);
		skull.close();
		
		
		
		
		
		

	}

}
