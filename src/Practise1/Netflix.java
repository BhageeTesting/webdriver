package Practise1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Netflix {
	public static void main(String[] args)throws Throwable {
		WebDriver drake= new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("F:\\firstclass\\WebDriver\\PropertyFile\\Netflix.properties"));
		drake.manage().window().maximize();
		drake.manage().deleteAllCookies();
		drake.navigate().to(p.getProperty("url"));
		drake.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drake.findElement(By.xpath(p.getProperty("signinele"))).click();
		drake.findElement(By.xpath(p.getProperty("username"))).sendKeys(p.getProperty("user"));
		drake.findElement(By.xpath(p.getProperty("password"))).sendKeys(p.getProperty("pass"));
		drake.findElement(By.xpath(p.getProperty("signin"))).click();
		String expected="browse";
		String actual=drake.getCurrentUrl();
		if (actual.toLowerCase().contains(expected.toLowerCase())) {
			System.out.println("logged in successfull"+expected+"    "+actual);
			
		}else {
			System.out.println("logged in failed"+expected+"    "+actual);
		}
		drake.findElement(By.xpath(p.getProperty("Bhagee"))).click();
		Actions ac= new Actions(drake);
		ac.moveToElement(drake.findElement(By.xpath(p.getProperty("icon")))).click().perform();
		//drake.findElement(By.xpath(p.getProperty("icon"))).click();
		ac.moveToElement(drake.findElement(By.xpath(p.getProperty("signout")))).click().perform();
		drake.close();
	}

}
