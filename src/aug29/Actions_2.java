package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_2 {

	public static void main(String[] args) throws InterruptedException {
		// perfom action
		WebDriver skew=new ChromeDriver();
		skew.manage().window().maximize();
		skew.manage().deleteAllCookies();
		skew.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		//create action class object
		Actions drake= new Actions(skew);
		skew.findElement(By.name("q")).sendKeys("jobs in ");
	drake.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	drake.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	drake.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	drake.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	drake.sendKeys(Keys.ARROW_DOWN).click().perform();
	Thread.sleep(3000);
	drake.sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	skew.findElement(By.xpath("//h3[contains(text(),'Jobs in Canada (with Salaries) 2022 | Indeed.com C')]")).click();
	Thread.sleep(5000);
	skew.quit();
		

	}

}
