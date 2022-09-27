package aug24;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyiteminlist_1 {

	public static void main(String[] args) throws Throwable {
		// verify an exists iin list box or not //expected item equal to actual
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://amazon.in");
		Thread.sleep(5000);
		Select alllist= new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
		Thread.sleep(2000);
		//alllist.getOptions();
		List<WebElement> drake= alllist.getOptions();
		System.out.println("number of items are::"+drake.size());
		Thread.sleep(2000);
		String expected="deals";
		Boolean itemexist=false;
		
		//to print each item
		for (WebElement each : drake) {
			Thread.sleep(2000);
			String actual=each.getText();
			System.out.println(actual);
			if (actual.equalsIgnoreCase(expected)) {
				itemexist=true;
				break;
				
			}
		}
			if (itemexist) {
				System.out.println("item found:"+expected);
				
			}
			else {
				System.out.println("item not found:"+expected);

			}
			
			
		driver.close();
		

	}
	}
