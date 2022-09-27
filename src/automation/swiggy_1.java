package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy_1 {

	public static void main(String[] args) throws Throwable {
		// TODO gitam loginpage
		WebDriver portal =new ChromeDriver();
		portal.manage().window().maximize();
		portal.manage().deleteAllCookies();
		portal.get("https://login.gitam.edu/Login.aspx");
		Thread.sleep(5000);
		portal.findElement(By.xpath("//input[@id='txtusername']")).sendKeys("1210414754");
		portal.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		portal.findElement(By.xpath("//input[@id='Submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		portal.quit();
		
		
		
		

	}

}
