package practise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Itemsearchinlist {

	public static void main(String[] args) throws Throwable  {
		// 
WebDriver skull=new ChromeDriver();
skull.manage().window().maximize();
skull.manage().deleteAllCookies();
skull.get("https://money.rediff.com/mutual-funds");
Thread.sleep(5000);
//print all items
List<WebElement> items=skull.findElements(By.cssSelector("#type"));
System.out.println("number of items present are:"+items.size());

String expected="Closed Ended";
Boolean itemexist=false;

//print names one by one and check for the item

for (WebElement each : items) {
	String actual=each.getText();
	System.out.println(actual);
	Thread.sleep(3000);
	if (actual.equalsIgnoreCase(expected)) {
		Thread.sleep(3000);
		 itemexist=true;
		break;
		
	}
	
}
if (itemexist) {
	System.out.println("item found in list"+expected);
	
} else {
	System.out.println("item not found in list"+expected);

}
skull.close();






	}

}
