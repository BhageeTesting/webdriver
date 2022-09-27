package automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Selenium_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver holder=new ChromeDriver();
holder.manage().window().maximize();
holder.get("https://www.primusbank.qedge.com");
holder.manage().window().maximize();
holder.manage().deleteAllCookies();
holder.findElement(By.id("txtuId"));
holder.findElement(By.partialLinkText("Disclaim"));
Thread.sleep(15000);
holder.close();


	}

}
