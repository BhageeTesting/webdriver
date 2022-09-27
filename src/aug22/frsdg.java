package aug22;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frsdg {

	public static void main(String[] args) throws Throwable {
		// to verify item in alist box
		WebDriver strange= new ChromeDriver();
		strange.manage().window().maximize();
		strange.manage().deleteAllCookies();
		strange.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		Select item= new Select(strange.findElement(By.name("Type")));
		List<WebElement> tron= item.getOptions();
		 
		String expected="open ended";
		Boolean itemexist= false;
		
		for (WebElement each : tron) {
			String actual=each.getText();
			Thread.sleep(3000);
			System.out.println(actual);
			if(actual.equalsIgnoreCase(expected)) {
				itemexist=true;
			break;
			
			
		}
		}
		if (itemexist) {
			System.out.println("item found in the list:"+expected);
			Thread.sleep(2000);
			
		} else {
			System.out.println("item found in list:"+expected);
			

		}
		strange.close();
		

	}

}
