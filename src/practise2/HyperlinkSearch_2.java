package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HyperlinkSearch_2 {

	public static void main(String[] args) throws Throwable {
		// search specific item from listbox
		
		WebDriver con=new ChromeDriver();
		con.manage().window().maximize();
		con.manage().deleteAllCookies();
		con.get("https://amazon.in");
		Thread.sleep(5000);
		//store dropdown into  list
		List<WebElement> itemlist= con.findElements(By.xpath("//select[@title='Search in']"));
		//size and each item 
		System.out.println(itemlist.size());
		
		String expected="Gift Cards";
		Boolean item=false;
		for (WebElement each : itemlist) {
			String actual=each.getText();
			Thread.sleep(3000);
			System.out.println(actual);
			if (actual.contains(expected)) {
				item=true;
				Thread.sleep(2000);
				break;
				}
			
				}if (item) 
				{
				System.out.println("item has been found  "+expected);
				
			}else {
				System.out.println("item has not been found  "+expected);
			}
			
		con.close();
		
	
		
	
		

	}

}
