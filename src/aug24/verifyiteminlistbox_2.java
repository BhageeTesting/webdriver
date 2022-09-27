package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyiteminlistbox_2 {

	public static void main(String[] args) throws Throwable {
		// verify item in list box
		WebDriver drake= new ChromeDriver();
		drake.manage().window().maximize();
		drake.manage().deleteAllCookies();
		drake.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		Select list=new Select(drake.findElement(By.name("Amc")));
		List<WebElement> allitems=list.getOptions();
		System.out.println("number of items:"+allitems.size());
		String expected="dsp-mutual-fund";
		Boolean itemexist=false;
		for (WebElement each : allitems) {
			String actual=each.getText();
			Thread.sleep(2000);
			System.out.println(actual);
			if (actual.equalsIgnoreCase(expected)) {
				itemexist=true;
				break;
			}
		}
			
				if(itemexist) {
					System.out.println("item found:"+expected);
				}
				else {
					System.out.println("item not found:"+expected);
				
				
			}	
			
			
			
		
		
		

	}

}
