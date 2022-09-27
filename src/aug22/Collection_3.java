package aug22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//total no.of links and print their names accordingly
public class Collection_3 {

	public static void main(String[] args) throws Throwable {
		WebDriver oops=new ChromeDriver();
		oops.manage().window().maximize();
		oops.manage().deleteAllCookies();
		oops.get("https://www.etv.co.in/channels/home;jsessionid=09BD2FC2AC0B05A2320E239B50F589FC");
		Thread.sleep(5000);
		List<WebElement> channel= oops.findElements(By.cssSelector("a"));
		System.out.println("Total no.of links are:"+channel.size());
		for (WebElement gucci : channel) {
			String don=gucci.getText();
			Thread.sleep(300);
			System.out.println(don);
		
			
		}
		oops.close();
		
		
		
		
		
				

	}

}
