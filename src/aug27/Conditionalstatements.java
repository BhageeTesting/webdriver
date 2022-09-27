package aug27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalstatements {

	public static void main(String[] args) throws Throwable {
		// verify re enter email is diaplayed or hidden and verify radio bottons are checked or unchecked
	
		WebDriver skull= new ChromeDriver();
		skull.manage().window().maximize();
		skull.manage().deleteAllCookies();
		skull.get("https://www.facebook.com/");
		Thread.sleep(4000);
		skull.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement variable=skull.findElement(By.name("reg_email_confirmation__"));
		boolean value=variable.isDisplayed();
		System.out.println(value);
		List<WebElement> radio=skull.findElements(By.xpath("//input[@class='_8esa']"));
		System.out.println("number of radio buttons are:"+radio.size());
		Thread.sleep(3000);
		for (WebElement each : radio) {
			System.out.println(each.getText());
			Thread.sleep(4000);
			
			
		}
		skull.close();
		

	}

}
