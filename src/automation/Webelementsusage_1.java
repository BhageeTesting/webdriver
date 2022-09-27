package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsusage_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver don=new ChromeDriver();
don.manage().window().maximize();
don.manage().deleteAllCookies();
don.get("https://www.netflix.com/in/login");
Thread.sleep(2000);
WebElement username= don.findElement(By.xpath("//input[@id='id_userLoginId']")) ;
username.clear();
username.sendKeys("anjalisgrl.12@gmail.com");
WebElement password= don.findElement(By.id("id_password"));
password.clear();
password.sendKeys("Ajjupajju@01");
don.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
Thread.sleep(5000);
don.quit();


	}

}
