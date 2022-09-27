package Practise1;

import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws Throwable {
		// nykaa 
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.nykaa.com");
		Thread.sleep(5000);
		Actions con= new Actions(skull);
		con.moveToElement(skull.findElement(By.xpath("//a[normalize-space()='fragrance']"))).perform();
		con.moveToElement(skull.findElement(By.xpath("(//a[@target='_blank'][normalize-space()='Dior'])[1]"))).click().perform();
		Thread.sleep(5000);
		//store window handles into arraylist
		ArrayList<String> allwins=new ArrayList<String>(skull.getWindowHandles());
		//acces to child
		skull.switchTo().window(allwins.get(1));
		con.moveToElement(skull.findElement(By.xpath("(//img[@class='nw_img_scale nykka-editor-view lazy'])[5]"))).click().perform();
	Thread.sleep(5000);
	
	
	//skull.switchTo().window(allwins.get(1));
	String url=skull.getCurrentUrl();
	System.out.println(url);
	skull.close();
	
	skull.switchTo().window(allwins.get(2));
	String Title= skull.getTitle();
	System.out.println(Title);
	skull.close();
	
	skull.switchTo().window(allwins.get(0));
	skull.findElement(By.xpath("//span[normalize-space()='Account']")).click();
	Thread.sleep(4000);
	skull.close();
	
		
		
		
		
		
		
		
		
		
		

	}

}
