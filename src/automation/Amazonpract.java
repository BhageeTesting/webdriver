package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpract {

	public static void main(String[] args) throws Throwable {
		// amazon select product
WebDriver shop=new ChromeDriver();
shop.manage().window().maximize();
shop.manage().deleteAllCookies();
shop.get("https://www.amazon.in/");
Thread.sleep(5000);
shop.findElement(By.linkText("Mobiles")).click();
shop.findElement(By.xpath("//span[contains(text(),'Mobile Accessories')]")).click();
shop.findElement(By.tagName("body")).click(); 
Thread.sleep(5000);
shop.quit();
	}

}
