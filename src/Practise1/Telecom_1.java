package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Telecom_1 {

	public static void main(String[] args) throws Throwable {
		// Telecom domain
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.demostelecom.com/");
		Thread.sleep(3000);
		skull.findElement(By.className("link-inner")).click();
		Thread.sleep(5000);
		Actions ac= new Actions(skull);
		ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Products']"))).perform();
		ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Telecommunication']"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Products']"))).perform();
		ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Aviation Obstruction Light']"))).click().perform();Thread.sleep(2000);
		Thread.sleep(5000);
		ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Products']"))).perform();
        ac.moveToElement(skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Cable Ties']"))).click().perform();
		Thread.sleep(5000);
		skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Business Partner']")).click();
		Thread.sleep(3000);
		skull.findElement(By.xpath("//img[@alt='huawei logo png']")).click();
		Thread.sleep(2000);
     skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Business Partner']")).click();
		skull.findElement(By.xpath("//img[@alt='vodafone logo png']")).click();
      Thread.sleep(2000);
      skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Business Partner']")).click();
		skull.findElement(By.xpath("//img[@alt='siemens logo png']")).click();
		Thread.sleep(3000);
	      skull.findElement(By.xpath("//span[@class='link-inner'][normalize-space()='Business Partner']")).click();
			skull.findElement(By.xpath("//img[@alt='turkcell logo png']")).click();
			Thread.sleep(4000);
			skull.close();
       
		
		

	}

}
