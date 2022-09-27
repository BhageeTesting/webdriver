package practise3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods_2 {

	public static void main(String[] args) throws Throwable {
		// check whether radio buttons are active or not in a collection 
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.facebook.com");
		Thread.sleep(5000);
		skull.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		List<WebElement> radio=skull.findElements(By.xpath("//input[@class='_8esa']"));
		
		Thread.sleep(3000);
		System.out.println("Number of radio buttons available in page are:"+radio.size());
		
		//print those radiobuttons
		
	for (WebElement each : radio) {
		System.out.println(each.getText());
	}
		skull.close();
		
		
		
		
		

	}

}
