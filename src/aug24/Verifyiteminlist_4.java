package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifyiteminlist_4 {

	public static void main(String[] args) throws Throwable {
		// verify item in a list box and print until the item found out
		WebDriver skol=new ChromeDriver();
		skol.manage().window().maximize();
		skol.manage().deleteAllCookies();
		skol.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		Select list=new Select(skol.findElement(By.name("Class")));
		List<WebElement> alllist=list.getOptions();
		Thread.sleep(2000);
		String expected="Gilt Fund";
		Boolean itemexist=false;
		for (WebElement each : alllist) {
			String actual=each.getText();
			Thread.sleep(2000);
			System.out.println(actual);
			if(actual.equalsIgnoreCase(expected)) {
				itemexist=true;
				break;
			}
				
			
			
		}
		if (itemexist) {
			System.out.println("item found in list"+expected);
			Thread.sleep(2000);
			
		} else {
			System.out.println("item not found in list"+expected);

		}
		skol.close();

	}

}
