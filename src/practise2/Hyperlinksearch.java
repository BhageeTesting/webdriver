package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinksearch {

	public static void main(String[] args) throws Throwable {
		// search hyperlink in a collection
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		List<WebElement> skull=driver.findElements(By.tagName("a"));
		System.out.println("number of hyperlinks are:"+skull.size());
		
		String expected="About";
		Boolean itemexist=false;
		
		//for printing each item one by one
		for (WebElement each : skull) {
			String actual=each.getText();
			System.out.println(actual);
			Thread.sleep(2000);
			if (actual.equalsIgnoreCase(expected)) {
				itemexist=true;
				break;
			}
		}if (itemexist) {
			System.out.println("link found in webpage:"+expected);
			
		} else {
			System.out.println("link not found in webpage:"+expected);

		}
		driver.close();
				
				
			}
			


		
			
			
			
			
		
		
		
		
		
		
			
		 
		}
	
	

		
			
			
		
		
		

	


