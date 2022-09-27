package aug22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcollection_2 {

	public static void main(String[] args) throws Throwable {
		WebDriver gather= new ChromeDriver();
		gather.manage().window().maximize();
		gather.manage().deleteAllCookies();
		gather.get("https://edition.cnn.com/");
		List<WebElement> paper=gather.findElements(By.cssSelector("a"));
		System.out.println("total number of links:"+paper.size());
		
		for (WebElement news : paper) {
			String links=news.getText();
			Thread.sleep(300);
			System.out.println(links);
			
		}
		gather.close();

	}

}
