package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkscollection_1 {

	public static void main(String[] args) throws Throwable {
		// Hyperlinks collection
		WebDriver skull=new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.amazon.in/");
		Thread.sleep(5000);
	//	store all links into list interface
		List<WebElement> alllinks=skull.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		
	//print all links each one by one// by using foreach loop
		for (WebElement each : alllinks) {
			Thread.sleep(300);
			String getname=each.getText();
			String getlink=each.getAttribute("href");
			System.out.println(getname+"   "+getlink);
			
			
		}
		skull.close();
		
		

	}

}
